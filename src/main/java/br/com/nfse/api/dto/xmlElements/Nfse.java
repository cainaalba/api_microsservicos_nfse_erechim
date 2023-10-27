package br.com.nfse.api.dto.xmlElements;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;

import br.com.nfse.api.dto.services.GerarNfseEnvio;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Nfse {
    private GerarNfseEnvio gerarNfseEnvio;

    @XmlElement(name = "GerarNfseEnvio", namespace = "http://www.abrasf.org.br/nfse.xsd")
    public GerarNfseEnvio getGerarNfseEnvio() {
        return gerarNfseEnvio;
    }
}
