package br.com.nfse.api.dto.xmlElements;

import javax.validation.Valid;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rps {
    @Valid
    private InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;

    @XmlElement(name = "InfDeclaracaoPrestacaoServico")
    public InfDeclaracaoPrestacaoServico getInfDeclaracaoPrestacaoServico() {
        return infDeclaracaoPrestacaoServico;
    }
}
