package br.com.nfse.api.dto.xmlElements;

import javax.validation.Valid;

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
@XmlRootElement(name = "GerarNfseEnvio", namespace = "http://www.abrasf.org.br/nfse.xsd")
public class GerarNfseEnvio {
    @Valid
    private Rps rps;
    
    @XmlElement(name = "Rps")
    public Rps getRps() {
        return rps;
    }
}
