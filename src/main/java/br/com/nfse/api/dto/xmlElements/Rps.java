package br.com.nfse.api.dto.xmlElements;

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

    @XmlElement(name = "InfDeclaracaoPrestacaoServico")
    public InfDeclaracaoPrestacaoServico getInfDeclaracaoPrestacaoServico() {
        return infDeclaracaoPrestacaoServico;
    }
}
