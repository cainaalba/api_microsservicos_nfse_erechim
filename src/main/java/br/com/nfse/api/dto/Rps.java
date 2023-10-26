package br.com.nfse.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rps {
    private InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;
    private Signature signature;

    @XmlElement(name = "InfDeclaracaoPrestacaoServico")
    public InfDeclaracaoPrestacaoServico getInfDeclaracaoPrestacaoServico() {
        return infDeclaracaoPrestacaoServico;
    }

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public Signature getSignature() {
        return signature;
    }
}
