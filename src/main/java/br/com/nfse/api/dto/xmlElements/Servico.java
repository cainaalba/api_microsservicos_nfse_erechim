package br.com.nfse.api.dto.xmlElements;

import br.com.nfse.api.dto.emun.ExigibilidadeISS;
import br.com.nfse.api.dto.emun.IssRetido;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Servico {
    private Valores valores;
    private IssRetido issRetido;
    private String itemListaServico;
    private String discriminacao;
    private String codigoMunicipio;
    private ExigibilidadeISS exigibilidadeISS;
    private String municipioIncidencia;

    @XmlElement(name = "Valores")
    public Valores getValores() {
        return this.valores;
    }

    @XmlElement(name = "IssRetido")
    public IssRetido getIssRetido() {
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
    public ExigibilidadeISS getExigibilidadeISS() {
        return this.exigibilidadeISS;
    }

    @XmlElement(name = "MunicipioIncidencia")
    public String getMunicipioIncidencia() {
        return this.municipioIncidencia;
    }

}
