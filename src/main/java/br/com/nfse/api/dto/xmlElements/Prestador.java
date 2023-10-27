package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Prestador")
public class Prestador {
    Cnpj cpfCnpj;
    String inscrMunicipal;

    @XmlElement(name = "CpfCnpj")
    public Cnpj getCpfCnpj() {
        return cpfCnpj;
    }

    @XmlElement(name = "InscricaoMunicipal")
    public String getInscrMunicipal() {
        return inscrMunicipal;
    }

}
