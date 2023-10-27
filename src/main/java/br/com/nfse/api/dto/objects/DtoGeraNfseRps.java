package br.com.nfse.api.dto.objects;

import br.com.nfse.api.dto.emun.IncentivoFiscal;
import br.com.nfse.api.dto.emun.OptanteSimplesNacional;
import br.com.nfse.api.dto.xmlElements.InfDeclaracaoPrestacaoServico;
import br.com.nfse.api.dto.xmlElements.Servico;
import jakarta.validation.Valid;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoGeraNfseRps {
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
