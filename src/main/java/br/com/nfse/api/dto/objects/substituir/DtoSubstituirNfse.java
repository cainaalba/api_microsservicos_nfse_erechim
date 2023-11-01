package br.com.nfse.api.dto.objects.substituir;

import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfse;
import br.com.nfse.api.dto.objects.gerar.DtoGeraNfseRps;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoSubstituirNfse {
    private DtoCancelarNfse cancelar;
    private DtoGeraNfseRps rps;
}
