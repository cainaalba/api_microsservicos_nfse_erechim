package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "InfPedidoCancelamento")
public class PedidoCancelamento {
    public IdentificacaoNfse identificacaoNfse;
	public String codigoCancelamento;

    @XmlElement(name = "IdentificacaoNfse")
    public IdentificacaoNfse getIdentificacaoNfse() {
        return this.identificacaoNfse;
    }

    @XmlElement(name = "CodigoCancelamento")
    public String getCodigoCancelamento() {
        return this.codigoCancelamento;
    }
}
