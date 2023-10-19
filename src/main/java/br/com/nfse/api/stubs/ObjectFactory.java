
package br.com.nfse.api.stubs;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.nfse.api.servico package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CancelarNfse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "CancelarNfse");
    private static final QName _CancelarNfseResponse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "CancelarNfseResponse");
    private static final QName _ConsultarNfseFaixa_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "ConsultarNfseFaixa");
    private static final QName _ConsultarNfseFaixaResponse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "ConsultarNfseFaixaResponse");
    private static final QName _EnviarLoteRpsSincrono_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "EnviarLoteRpsSincrono");
    private static final QName _EnviarLoteRpsSincronoResponse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "EnviarLoteRpsSincronoResponse");
    private static final QName _GerarNfse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "GerarNfse");
    private static final QName _GerarNfseResponse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "GerarNfseResponse");
    private static final QName _SubstituirNfse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "SubstituirNfse");
    private static final QName _SubstituirNfseResponse_QNAME = new QName("http://NFSe.wsservices.systempro.com.br/", "SubstituirNfseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.nfse.api.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelarNfse }
     * 
     * @return
     *     the new instance of {@link CancelarNfse }
     */
    public CancelarNfse createCancelarNfse() {
        return new CancelarNfse();
    }

    /**
     * Create an instance of {@link CancelarNfseResponse }
     * 
     * @return
     *     the new instance of {@link CancelarNfseResponse }
     */
    public CancelarNfseResponse createCancelarNfseResponse() {
        return new CancelarNfseResponse();
    }

    /**
     * Create an instance of {@link ConsultarNfseFaixa }
     * 
     * @return
     *     the new instance of {@link ConsultarNfseFaixa }
     */
    public ConsultarNfseFaixa createConsultarNfseFaixa() {
        return new ConsultarNfseFaixa();
    }

    /**
     * Create an instance of {@link ConsultarNfseFaixaResponse }
     * 
     * @return
     *     the new instance of {@link ConsultarNfseFaixaResponse }
     */
    public ConsultarNfseFaixaResponse createConsultarNfseFaixaResponse() {
        return new ConsultarNfseFaixaResponse();
    }

    /**
     * Create an instance of {@link EnviarLoteRpsSincrono }
     * 
     * @return
     *     the new instance of {@link EnviarLoteRpsSincrono }
     */
    public EnviarLoteRpsSincrono createEnviarLoteRpsSincrono() {
        return new EnviarLoteRpsSincrono();
    }

    /**
     * Create an instance of {@link EnviarLoteRpsSincronoResponse }
     * 
     * @return
     *     the new instance of {@link EnviarLoteRpsSincronoResponse }
     */
    public EnviarLoteRpsSincronoResponse createEnviarLoteRpsSincronoResponse() {
        return new EnviarLoteRpsSincronoResponse();
    }

    /**
     * Create an instance of {@link GerarNfse }
     * 
     * @return
     *     the new instance of {@link GerarNfse }
     */
    public GerarNfse createGerarNfse() {
        return new GerarNfse();
    }

    /**
     * Create an instance of {@link GerarNfseResponse }
     * 
     * @return
     *     the new instance of {@link GerarNfseResponse }
     */
    public GerarNfseResponse createGerarNfseResponse() {
        return new GerarNfseResponse();
    }

    /**
     * Create an instance of {@link SubstituirNfse }
     * 
     * @return
     *     the new instance of {@link SubstituirNfse }
     */
    public SubstituirNfse createSubstituirNfse() {
        return new SubstituirNfse();
    }

    /**
     * Create an instance of {@link SubstituirNfseResponse }
     * 
     * @return
     *     the new instance of {@link SubstituirNfseResponse }
     */
    public SubstituirNfseResponse createSubstituirNfseResponse() {
        return new SubstituirNfseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarNfse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarNfse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "CancelarNfse")
    public JAXBElement<CancelarNfse> createCancelarNfse(CancelarNfse value) {
        return new JAXBElement<>(_CancelarNfse_QNAME, CancelarNfse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarNfseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarNfseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "CancelarNfseResponse")
    public JAXBElement<CancelarNfseResponse> createCancelarNfseResponse(CancelarNfseResponse value) {
        return new JAXBElement<>(_CancelarNfseResponse_QNAME, CancelarNfseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNfseFaixa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNfseFaixa }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "ConsultarNfseFaixa")
    public JAXBElement<ConsultarNfseFaixa> createConsultarNfseFaixa(ConsultarNfseFaixa value) {
        return new JAXBElement<>(_ConsultarNfseFaixa_QNAME, ConsultarNfseFaixa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNfseFaixaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNfseFaixaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "ConsultarNfseFaixaResponse")
    public JAXBElement<ConsultarNfseFaixaResponse> createConsultarNfseFaixaResponse(ConsultarNfseFaixaResponse value) {
        return new JAXBElement<>(_ConsultarNfseFaixaResponse_QNAME, ConsultarNfseFaixaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarLoteRpsSincrono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarLoteRpsSincrono }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "EnviarLoteRpsSincrono")
    public JAXBElement<EnviarLoteRpsSincrono> createEnviarLoteRpsSincrono(EnviarLoteRpsSincrono value) {
        return new JAXBElement<>(_EnviarLoteRpsSincrono_QNAME, EnviarLoteRpsSincrono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarLoteRpsSincronoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarLoteRpsSincronoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "EnviarLoteRpsSincronoResponse")
    public JAXBElement<EnviarLoteRpsSincronoResponse> createEnviarLoteRpsSincronoResponse(EnviarLoteRpsSincronoResponse value) {
        return new JAXBElement<>(_EnviarLoteRpsSincronoResponse_QNAME, EnviarLoteRpsSincronoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarNfse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GerarNfse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "GerarNfse")
    public JAXBElement<GerarNfse> createGerarNfse(GerarNfse value) {
        return new JAXBElement<>(_GerarNfse_QNAME, GerarNfse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarNfseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GerarNfseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "GerarNfseResponse")
    public JAXBElement<GerarNfseResponse> createGerarNfseResponse(GerarNfseResponse value) {
        return new JAXBElement<>(_GerarNfseResponse_QNAME, GerarNfseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstituirNfse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubstituirNfse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "SubstituirNfse")
    public JAXBElement<SubstituirNfse> createSubstituirNfse(SubstituirNfse value) {
        return new JAXBElement<>(_SubstituirNfse_QNAME, SubstituirNfse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstituirNfseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubstituirNfseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://NFSe.wsservices.systempro.com.br/", name = "SubstituirNfseResponse")
    public JAXBElement<SubstituirNfseResponse> createSubstituirNfseResponse(SubstituirNfseResponse value) {
        return new JAXBElement<>(_SubstituirNfseResponse_QNAME, SubstituirNfseResponse.class, null, value);
    }

}
