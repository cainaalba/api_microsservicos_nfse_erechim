package br.com.nfse.api.dto.xmlElements;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Valores {
    private String valorServicos;
    private String valorDeducoes;
    private String valorPis;
    private String valorCofins;
    private String valorInss;
    private String valorIr;
    private String valorCsll;
    private String valorIss;

    @NotBlank
    @Min(1)
    private Integer aliquota;
    private String descontoIncondicionado;
    private String descontoCondicionado;
    private String baseCalculo;

    @XmlElement(name = "ValorServicos")
    public String getValorServicos() {
        return this.valorServicos;
    }

    @XmlElement(name = "ValorDeducoes")
    public String getValorDeducoes() {
        return this.valorDeducoes;
    }

    @XmlElement(name = "ValorPis")
    public String getValorPis() {
        return this.valorPis;
    }

    @XmlElement(name = "ValorCofins")
    public String getValorCofins() {
        return this.valorCofins;
    }

    @XmlElement(name = "ValorInss")
    public String getValorInss() {
        return this.valorInss;
    }

    @XmlElement(name = "ValorIr")
    public String getValorIr() {
        return this.valorIr;
    }

    @XmlElement(name = "ValorCsll")
    public String getValorCsll() {
        return this.valorCsll;
    }

    @XmlElement(name = "ValorIss")
    public String getValorIss() {
        return this.valorIss;
    }

    @XmlElement(name = "Aliquota")
    public Integer getAliquota() {
        return this.aliquota;
    }

    @XmlElement(name = "DescontoIncondicionado")
    public String getDescontoIncondicionado() {
        return this.descontoIncondicionado;
    }

    @XmlElement(name = "DescontoCondicionado")
    public String getDescontoCondicionado() {
        return this.descontoCondicionado;
    }

    @XmlElement(name = "BaseCalculo")
    public String getBaseCalculo() {
        return this.baseCalculo;
    }
}
