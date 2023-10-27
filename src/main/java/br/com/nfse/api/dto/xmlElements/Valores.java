package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Valores {
    private double valorServicos;
    private double valorDeducoes;
    private double valorPis;
    private double valorCofins;
    private double valorInss;
    private double valorIr;
    private double valorCsll;
    private double valorIss;
    private double aliquota;
    private double descontoIncondicionado;
    private double descontoCondicionado;
    private double baseCalculo;

    @XmlElement(name = "ValorServicos")
    public double getValorServicos() {
        return this.valorServicos;
    }

    @XmlElement(name = "ValorDeducoes")
    public double getValorDeducoes() {
        return this.valorDeducoes;
    }

    @XmlElement(name = "ValorPis")
    public double getValorPis() {
        return this.valorPis;
    }

    @XmlElement(name = "ValorCofins")
    public double getValorCofins() {
        return this.valorCofins;
    }

    @XmlElement(name = "ValorInss")
    public double getValorInss() {
        return this.valorInss;
    }

    @XmlElement(name = "ValorIr")
    public double getValorIr() {
        return this.valorIr;
    }

    @XmlElement(name = "ValorCsll")
    public double getValorCsll() {
        return this.valorCsll;
    }

    @XmlElement(name = "ValorIss")
    public double getValorIss() {
        return this.valorIss;
    }

    @XmlElement(name = "Aliquota")
    public double getAliquota() {
        return this.aliquota;
    }

    @XmlElement(name = "DescontoIncondicionado")
    public double getDescontoIncondicionado() {
        return this.descontoIncondicionado;
    }

    @XmlElement(name = "DescontoCondicionado")
    public double getDescontoCondicionado() {
        return this.descontoCondicionado;
    }

    @XmlElement(name = "BaseCalculo")
    public double getBaseCalculo() {
        return this.baseCalculo;
    }
}
