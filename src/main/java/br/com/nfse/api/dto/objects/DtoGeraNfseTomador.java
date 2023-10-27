package br.com.nfse.api.dto.objects;

import br.com.nfse.api.dto.xmlElements.DadosTomador.Contato;
import br.com.nfse.api.dto.xmlElements.DadosTomador.Endereco;
import br.com.nfse.api.dto.xmlElements.DadosTomador.IdentificacaoTomador;
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
