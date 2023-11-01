package br.com.nfse.api.dto.xmlElements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import br.com.nfse.api.dto.xmlElements.dadosTomador.Tomador;
import jakarta.xml.bind.annotation.XmlElement;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InfDeclaracaoPrestacaoServico {
    private Servico servico;
    private String competencia;
    private Prestador prestador;
    private Tomador tomador;
    private String regimeEspecialTributacao;
    private String optanteSimplesNacional;
    private String incentivoFiscal;

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

    @XmlElement(name = "RegimeEspecialTributacao")
    public String getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }

    @XmlElement(name = "OptanteSimplesNacional")
    public String getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    @XmlElement(name = "IncentivoFiscal")
    public String getIncentivoFiscal() {
        return incentivoFiscal;
    }
}

