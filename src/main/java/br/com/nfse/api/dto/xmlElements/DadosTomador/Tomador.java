package br.com.nfse.api.dto.xmlElements.dadosTomador;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Tomador")
public class Tomador {
    @XmlElement(name = "IdentificacaoTomador")
    public IdentificacaoTomador identificacaoTomador;
    
    @XmlElement(name = "RazaoSocial")
    public String razaoSocial;

    @XmlElement(name = "Endereco")
    public Endereco endereco;

    @XmlElement(name = "Contato")
    public Contato contato;

    // public IdentificacaoTomador getIdentificacaoTomador() {
    //     return this.identificacaoTomador;
    // }

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
