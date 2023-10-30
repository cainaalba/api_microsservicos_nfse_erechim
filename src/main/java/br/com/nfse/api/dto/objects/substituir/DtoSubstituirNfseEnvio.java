package br.com.nfse.api.dto.objects.substituir;

import jakarta.validation.Valid;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoSubstituirNfseEnvio {
    @Valid
    private DtoSubstituirNfse substituir;
}
