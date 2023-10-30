package br.com.nfse.api.dto.objects.gerar;

import br.com.nfse.api.dto.xmlElements.dadosTomador.Contato;
import br.com.nfse.api.dto.xmlElements.dadosTomador.Endereco;
import br.com.nfse.api.dto.xmlElements.dadosTomador.IdentificacaoTomador;
import jakarta.validation.Valid;
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
