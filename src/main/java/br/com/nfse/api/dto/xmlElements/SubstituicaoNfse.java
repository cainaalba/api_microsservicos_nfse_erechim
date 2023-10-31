package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubstituicaoNfse {
    @XmlElement(name = "Pedido")
    public Pedido pedido;

    @XmlElement(name = "Rps")
    private Rps rps;
}
