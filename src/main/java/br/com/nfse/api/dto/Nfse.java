package br.com.nfse.api.dto;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;

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
