package br.com.nfse.api.dto.objects.substituir;

import javax.validation.Valid;

import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfse;
import br.com.nfse.api.dto.objects.gerar.DtoGeraNfseRps;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoSubstituirNfse {
    @Valid
    private DtoCancelarNfse cancelar;

    @Valid
    private DtoGeraNfseRps rps;
}
