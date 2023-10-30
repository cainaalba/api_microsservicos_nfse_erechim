package br.com.nfse.api.dto.objects.gerar;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoGeraNfsePrestador {
    @NotBlank
    @Size(min = 1, max = 15)
    private String cpfCnpj;

    @NotBlank
    private String inscrMunicipal;
}
