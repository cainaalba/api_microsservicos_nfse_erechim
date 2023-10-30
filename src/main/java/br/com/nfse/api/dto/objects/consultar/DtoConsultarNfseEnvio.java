package br.com.nfse.api.dto.objects.consultar;

import jakarta.validation.Valid;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoConsultarNfseEnvio {
    @Valid
    private DtoConsultarNfseFaixa consultar;
}
