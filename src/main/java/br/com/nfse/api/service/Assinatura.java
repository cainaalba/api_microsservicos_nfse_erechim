package br.com.nfse.api.service;

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import br.com.nfse.api.config.Config;
import br.com.nfse.api.utils.XmlUtil;

public class Assinatura {
    private final String INF_DECL_PREST_SERV = "infDeclaracaoPrestacaoServico";
    private final String[] ELEMENTOS_ASSINAVEIS = new String[] { "InfPedidoCancelamento" };
    private Config config = new Config();

    public String assinar(String xml) throws Exception {
        return assinarXml(xml);
    }

    private String assinarXml(String xml) throws Exception {
        Document documentoAssinar = XmlUtil.documentFactory(xml);

        // Assina RPS
        NodeList elements = documentoAssinar.getDocumentElement().getElementsByTagName(INF_DECL_PREST_SERV);
        for (int i = 0; i < elements.getLength(); i++) {
            Element element = (Element) elements.item(i);
            element.setIdAttribute("Id", true); //DEFINE URI ID
            assinadDocumento(elements.item(i).getAttributes().getNamedItem("Id").getNodeValue(), element);
        }

        Document documentAssinado = XmlUtil.documentFactory(XmlUtil.xmlString(documentoAssinar));
        for (final String elementoAssinavel : ELEMENTOS_ASSINAVEIS) {
            NodeList elementsAssinado = documentAssinado.getDocumentElement().getElementsByTagName(elementoAssinavel);
            for (int i = 0; i < elementsAssinado.getLength(); i++) {
                Element element = (Element) elementsAssinado.item(i);
                element.setIdAttribute("Id", true);
                assinadDocumento(elementsAssinado.item(i).getAttributes().getNamedItem("Id").getNodeValue(), element);
            }
        }
        return XmlUtil.xmlString(documentAssinado);
    }

    private void assinadDocumento(String id, Element element) throws Exception {
        KeyStore keyStore = config.getKeyStore();

        // Obter a chave privada do certificado
        String keyAlias = keyStore.aliases().nextElement();
        PrivateKey privateKey = (PrivateKey) keyStore.getKey(keyAlias, XmlUtil.getPwCert().toCharArray());

        // Obter o certificado X.509
        X509Certificate cert = (X509Certificate) keyStore.getCertificate(keyAlias);

        // Assinar
        XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance("DOM");
        ArrayList<Transform> transformList = signatureFactory(signatureFactory);

        Reference reference = signatureFactory.newReference("#" + id,
                signatureFactory.newDigestMethod(DigestMethod.SHA1, null),
                transformList,
                null,
                null);
        SignedInfo signedInfo = signatureFactory.newSignedInfo(signatureFactory.newCanonicalizationMethod(
                CanonicalizationMethod.INCLUSIVE,
                (C14NMethodParameterSpec) null),
                signatureFactory.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                Collections.singletonList(reference));
        KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();

        List<X509Certificate> x509Content = new ArrayList<X509Certificate>();
        x509Content.add(cert);

        X509Data x509Data = keyInfoFactory.newX509Data(x509Content);
        KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));

        DOMSignContext dsc = new DOMSignContext(privateKey, element.getParentNode());
        XMLSignature signature = signatureFactory.newXMLSignature(signedInfo, keyInfo);
        signature.sign(dsc);
    }

    private ArrayList<Transform> signatureFactory(XMLSignatureFactory signatureFactory)
            throws Exception {
        ArrayList<Transform> transformList = new ArrayList<Transform>();
        TransformParameterSpec tps = null;
        Transform envelopedTransform = signatureFactory.newTransform(Transform.ENVELOPED, tps);
        Transform c14NTransform = signatureFactory.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);
        transformList.add(envelopedTransform);
        transformList.add(c14NTransform);
        return transformList;
    }
}
