package br.com.nfse.api.dto.objects.gerar;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.nfse.api.dto.emun.IncentivoFiscal;
import br.com.nfse.api.dto.emun.OptanteSimplesNacional;
import br.com.nfse.api.dto.xmlElements.InfDeclaracaoPrestacaoServico;
import br.com.nfse.api.dto.xmlElements.Servico;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoGeraNfseRps {
    @NotBlank
    @Size(min = 1, max = 9)
    private String numeroRps;

    @Valid
    private DtoGeraNfsePrestador prestador;

    @Valid
    private DtoGeraNfseTomador tomador;

    @Valid
    private Servico servico;

    @Valid
    private InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;

    @Valid
    private OptanteSimplesNacional optanteSimplesNacional;

    @Valid
    private IncentivoFiscal incentivoFiscal;

    @NotBlank
    private String competencia;
}
