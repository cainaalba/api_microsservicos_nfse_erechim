package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidoCancelamento {
    @XmlElement(name = "IdentificacaoNfse")
    public IdentificacaoNfse identificacaoNfse;

    @XmlElement(name = "CodigoCancelamento")
    public String codigoCancelamento;
}
