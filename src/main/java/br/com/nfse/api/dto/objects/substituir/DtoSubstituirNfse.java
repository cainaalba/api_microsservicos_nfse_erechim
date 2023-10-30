package br.com.nfse.api.dto.objects.substituir;

import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfse;
import br.com.nfse.api.dto.objects.gerar.DtoGerarNfseEnvio;
import jakarta.validation.Valid;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoSubstituirNfse {
    @Valid
    private DtoCancelarNfse cancelar;

    @Valid
    private DtoGerarNfseEnvio rps;
}