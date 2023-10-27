package br.com.nfse.api.dto.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;

import br.com.nfse.api.dto.xmlElements.Rps;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "GerarNfseEnvio", namespace = "http://www.abrasf.org.br/nfse.xsd")
@XmlAccessorType(XmlAccessType.FIELD)
public class GerarNfseEnvio {
    private Rps rps;

    @XmlElement(name = "Rps")
    public Rps getRps() {
        return rps;
    }
}