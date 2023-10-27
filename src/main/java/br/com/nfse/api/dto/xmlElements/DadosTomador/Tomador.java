package br.com.nfse.api.dto.xmlElements.DadosTomador;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Tomador")
public class Tomador {
    public IdentificacaoTomador identificacaoTomador;
    public String razaoSocial;
    public Endereco endereco;
    public Contato contato;

    // @XmlElement(name = "IdentificacaoTomador")
    // public IdentificacaoTomador getIdentificacaoTomador() {
    //     return this.identificacaoTomador;
    // }

    // @XmlElement(name = "RazaoSocial")
    // public String getRazaoSocial() {
    //     return this.razaoSocial;
    // }

    // @XmlElement(name = "Endereco")
    // public Endereco getEndereco() {
    //     return this.endereco;
    // }

    // @XmlElement(name = "Contato")
    // public Contato getContato() {
    //     return this.contato;
    // }

}
