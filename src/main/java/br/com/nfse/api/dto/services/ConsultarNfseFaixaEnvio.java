package br.com.nfse.api.dto.services;

import br.com.nfse.api.dto.xmlElements.Faixa;
import br.com.nfse.api.dto.xmlElements.Prestador;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "ConsultarNfseFaixaEnvio", namespace = "http://www.abrasf.org.br/nfse.xsd")
public class ConsultarNfseFaixaEnvio {
    private Prestador prestador;
    private Faixa faixa;
    private String pagina;

    @XmlElement(name = "Prestador")
    public Prestador getPrestador() {
        return prestador;
    }

    @XmlElement(name = "Faixa")
    public Faixa getFaixa() {
        return faixa;
    }

    @XmlElement(name = "Pagina")
    public String getPagFaixa() {
        return pagina;
    }
}
