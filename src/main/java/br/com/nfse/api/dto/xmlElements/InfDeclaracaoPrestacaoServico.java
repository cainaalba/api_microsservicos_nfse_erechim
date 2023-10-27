package br.com.nfse.api.dto.xmlElements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import br.com.nfse.api.dto.emun.IncentivoFiscal;
import br.com.nfse.api.dto.emun.OptanteSimplesNacional;
import br.com.nfse.api.dto.xmlElements.DadosTomador.Tomador;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InfDeclaracaoPrestacaoServico {
    private Servico servico;
    private String competencia;
    private Prestador prestador;
    private Tomador tomador;
    private OptanteSimplesNacional optanteSimplesNacional;
    private IncentivoFiscal incentivoFiscal;
    private String id;

    @XmlElement(name = "Servico")
    public Servico getServico() {
        return servico;
    }

    @XmlElement(name = "Competencia")
    public String getCompetencia() {
        return competencia;
    }

    @XmlElement(name = "Prestador")
    public Prestador getPrestador() {
        return prestador;
    }

    @XmlElement(name = "Tomador")
    public Tomador getTomador() {
        return tomador;
    }

    @XmlElement(name = "OptanteSimplesNacional")
    public OptanteSimplesNacional getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    @XmlElement(name = "IncentivoFiscal")
    public IncentivoFiscal getIncentivoFiscal() {
        return incentivoFiscal;
    }

    @XmlAttribute(name = "Id")
    public String getId() {
        return id;
    }
}

