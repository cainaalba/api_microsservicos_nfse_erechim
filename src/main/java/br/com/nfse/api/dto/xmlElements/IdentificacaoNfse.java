package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IdentificacaoNfse {
    @XmlElement(name = "Numero")
    public String nfse;

    @XmlElement(name = "CpfCnpj")
    public Cnpj cnpj;

    @XmlElement(name = "InscricaoMunicipal")
    public String inscrMunicipal;

    @XmlElement(name = "CodigoMunicipio")
    public String codigoMunicipio;

    public Cnpj getCpfCnpj() {
        return cnpj;
    }
}
