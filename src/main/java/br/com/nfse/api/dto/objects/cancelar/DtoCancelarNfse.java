package br.com.nfse.api.dto.objects.cancelar;

import br.com.nfse.api.dto.emun.CodigoCancelamento;

import br.com.nfse.api.dto.xmlElements.Cnpj;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoCancelarNfse {
    @NotBlank
    private String nfse;
    
    @Valid
    private Cnpj cpfCnpj;

    @Valid
    private String inscrMunicipal;

    @NotBlank
    private String codigoMunicipio;

    @Valid
    private CodigoCancelamento codigoCancelamento;
}
