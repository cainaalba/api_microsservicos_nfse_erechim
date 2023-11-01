package br.com.nfse.api.dto.objects.gerar;

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
    private String numeroRps;
    private DtoGeraNfsePrestador prestador;
    private DtoGeraNfseTomador tomador;
    private Servico servico;
    private String regimeEspecialTributacao;
    private InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;
    private OptanteSimplesNacional optanteSimplesNacional;
    private IncentivoFiscal incentivoFiscal;
    private String competencia;
}
