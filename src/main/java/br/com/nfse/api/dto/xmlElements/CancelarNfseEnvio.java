package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "CancelarNfseEnvio", namespace = "http://www.abrasf.org.br/nfse.xsd")
public class CancelarNfseEnvio {
    public PedidoCancelamento pedidoCancelamento;

    @XmlElement(name = "Pedido")
    public PedidoCancelamento getPedidoCancelamento() {
        return this.pedidoCancelamento;
    }

}
