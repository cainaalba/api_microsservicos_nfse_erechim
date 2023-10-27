package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cnpj {
    private String cnpj;

    @XmlElement(name = "Cnpj")
    public String getCnpj() {
        return cnpj;
    }
}
