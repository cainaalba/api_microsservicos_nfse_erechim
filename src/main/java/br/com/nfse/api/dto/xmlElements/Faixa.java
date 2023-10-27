package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Faixa {
    private String numeroNfseInicial;
    private String numeroNfseFinal;

    @XmlElement(name = "NumeroNfseInicial")
    public String getNumeroNfseInicial() {
        return numeroNfseInicial;
    }

    @XmlElement(name = "NumeroNfseFinal")
    public String getNumeroNfseFinal() {
        return numeroNfseFinal;
    }
}
