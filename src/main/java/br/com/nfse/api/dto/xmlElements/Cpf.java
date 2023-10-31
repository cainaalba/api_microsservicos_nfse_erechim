package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cpf {
    private String cpfCnpj;

    @XmlElement(name = "Cpf")
    public String getCpf() {
        return cpfCnpj;
    }
}
