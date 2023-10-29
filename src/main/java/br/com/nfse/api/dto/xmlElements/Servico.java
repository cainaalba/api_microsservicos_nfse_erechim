package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Servico {
    private Valores valores;
    private String issRetido;
    private String itemListaServico;
    private String discriminacao;
    private String codigoMunicipio;
    private String exigibilidadeISS;
    private String municipioIncidencia;

    @XmlElement(name = "Valores")
    public Valores getValores() {
        return this.valores;
    }

    @XmlElement(name = "IssRetido")
    public String getIssRetido() {
        return this.issRetido;
    }

    @XmlElement(name = "ItemListaServico")
    public String getItemListaServico() {
        return this.itemListaServico;
    }

    @XmlElement(name = "Discriminacao")
    public String getDiscriminacao() {
        return this.discriminacao;
    }

    @XmlElement(name = "CodigoMunicipio")
    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }

    @XmlElement(name = "ExigibilidadeISS")
    public String getExigibilidadeISS() {
        return this.exigibilidadeISS;
    }

    @XmlElement(name = "MunicipioIncidencia")
    public String getMunicipioIncidencia() {
        return this.municipioIncidencia;
    }

}
