package br.com.nfse.api.dto.xmlElements;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "IdentificacaoNfse")
public class IdentificacaoNfse {
    public String nfse;
    public Cnpj cnpj;
    public String inscrMunicipal;
    public String codigoMunicipio;

    @XmlElement(name = "Numero")
    public String getNfse() {
        return this.nfse;
    }

    @XmlElement(name = "CpfCnpj")
    public Cnpj getCpfCnpj() {
        return cnpj;
    }

    @XmlElement(name = "InscricaoMunicipal")
    public String getInscrMunicipal() {
        return inscrMunicipal;
    }

    @XmlElement(name = "CodigoMunicipio")
    public String getCodigoMunicipio() {
        return this.codigoMunicipio;
    }
}
