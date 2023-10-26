package br.com.nfse.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InfDeclaracaoPrestacaoServico {
    private Servico servico;
    private String competencia;
    private Prestador prestador;
    private Tomador tomador;
    private String optanteSimplesNacional;
    private String incentivoFiscal;
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
    public String getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    @XmlElement(name = "IncentivoFiscal")
    public String getIncentivoFiscal() {
        return incentivoFiscal;
    }

    @XmlAttribute(name = "Id")
    public String getId() {
        return id;
    }
}

