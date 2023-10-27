package br.com.nfse.api.dto.objects;

import br.com.nfse.api.dto.xmlElements.InfDeclaracaoPrestacaoServico;
import jakarta.validation.Valid;
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
