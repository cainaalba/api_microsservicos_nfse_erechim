package br.com.nfse.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(namespace = "http://www.abrasf.org.br/nfse.xsd", name = "GerarNfseEnvio")
public class GerarNfseEnvio {
    private List<Rps> rps;

    @XmlElement(name = "Rps")
    public List<Rps> getRps() {
        return rps;
    }
}
