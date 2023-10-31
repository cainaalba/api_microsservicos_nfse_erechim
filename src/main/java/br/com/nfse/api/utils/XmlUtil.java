package br.com.nfse.api.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlUtil {
    private static String pwCert;

    //URL PRODUÇÃO: //"https://www.nfse.erechim.rs.gov.br:8182/NfseService/NfseService"
    private static String urlBase = "https://www.nfse.erechim.rs.gov.br:8183/NfseService_Homolog/NfseService_Homolog";

    private static String cabecMsg = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<cabecalho xmlns=\"http://www.abrasf.org.br/nfse.xsd\" versao=\"2.00\">" +
            "<versaoDados>2.00</versaoDados>" +
            "</cabecalho>";

    public static Document documentFactory(String xml)
            throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes()));
        return document;
    }

    public static String xmlString(Document doc) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Transformer trans = TransformerFactory.newInstance().newTransformer();
        trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        trans.transform(new DOMSource(doc), new StreamResult(outputStream));
        return outputStream.toString();
    }

    public static String setPwCert(String pwCert) {
        return XmlUtil.pwCert = pwCert;
    }

    public static String getPwCert() {
        return XmlUtil.pwCert;
    }

    public static String getUrlBase() {
        return XmlUtil.urlBase;
    }

    public static String getCabecMsg() {
        return XmlUtil.cabecMsg;
    }
}
