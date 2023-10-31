package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @XmlElement(name = "InfPedidoCancelamento")
    public PedidoCancelamento pedidoCancelamento;
}
