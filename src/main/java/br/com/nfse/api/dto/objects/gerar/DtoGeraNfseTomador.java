package br.com.nfse.api.dto.objects.gerar;

import br.com.nfse.api.dto.xmlElements.dadosTomador.Contato;
import br.com.nfse.api.dto.xmlElements.dadosTomador.Endereco;
// import br.com.nfse.api.dto.xmlElements.dadosTomador.IdentificacaoTomador;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoGeraNfseTomador {
    // private IdentificacaoTomador identificacaoTomador;
    private String cpfCnpj;
    private String inscrMunicipal;
    private String razaoSocial;
    private Endereco endereco;
    private Contato contato;
}
