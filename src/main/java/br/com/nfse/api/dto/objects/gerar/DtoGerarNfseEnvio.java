package br.com.nfse.api.dto.objects.gerar;


import javax.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoGerarNfseEnvio {
    @Valid
    private DtoGeraNfseRps rps;
}
