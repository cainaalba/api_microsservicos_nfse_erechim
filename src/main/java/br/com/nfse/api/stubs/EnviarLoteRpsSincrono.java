
package br.com.nfse.api.stubs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EnviarLoteRpsSincrono complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="EnviarLoteRpsSincrono">
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
@XmlType(name = "EnviarLoteRpsSincrono", propOrder = {
    "nfseCabecMsg",
    "nfseDadosMsg"
})
@XmlRootElement(name = "EnviarLoteRpsSincrono")
public class EnviarLoteRpsSincrono {

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
