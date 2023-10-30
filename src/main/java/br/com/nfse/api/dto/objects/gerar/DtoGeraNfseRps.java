package br.com.nfse.api.dto.objects.gerar;

import br.com.nfse.api.dto.emun.IncentivoFiscal;
import br.com.nfse.api.dto.emun.OptanteSimplesNacional;
import br.com.nfse.api.dto.xmlElements.InfDeclaracaoPrestacaoServico;
import br.com.nfse.api.dto.xmlElements.Servico;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    private Servico servico;
    private InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;
    private OptanteSimplesNacional optanteSimplesNacional;
    private IncentivoFiscal incentivoFiscal;
    private String competencia;
}
