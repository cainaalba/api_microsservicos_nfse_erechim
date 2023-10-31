package br.com.nfse.api.dto.objects.gerar;

import javax.validation.Valid;

import br.com.nfse.api.dto.xmlElements.dadosTomador.Contato;
import br.com.nfse.api.dto.xmlElements.dadosTomador.Endereco;
import br.com.nfse.api.dto.xmlElements.dadosTomador.IdentificacaoTomador;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoGeraNfseTomador {
    @Valid
    private IdentificacaoTomador identificacaoTomador;

    @Valid
    private String razaoSocial;

    @Valid
    private Endereco endereco;

    @Valid
    private Contato contato;
}
