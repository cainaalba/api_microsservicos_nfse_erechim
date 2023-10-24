
package br.com.nfse.api.stubs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CancelarNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="CancelarNfse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nfseCabecMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfseDadosMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelarNfse", propOrder = {
    "nfseCabecMsg",
    "nfseDadosMsg"
})
@XmlRootElement(name = "CancelarNfse")
public class CancelarNfse {

    protected String nfseCabecMsg;
    protected String nfseDadosMsg;

    /**
     * Obtém o valor da propriedade nfseCabecMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfseCabecMsg() {
        return nfseCabecMsg;
    }

    /**
     * Define o valor da propriedade nfseCabecMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfseCabecMsg(String value) {
        this.nfseCabecMsg = value;
    }

    /**
     * Obtém o valor da propriedade nfseDadosMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfseDadosMsg() {
        return nfseDadosMsg;
    }

    /**
     * Define o valor da propriedade nfseDadosMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfseDadosMsg(String value) {
        this.nfseDadosMsg = value;
    }

}
