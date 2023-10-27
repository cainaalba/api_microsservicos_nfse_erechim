package br.com.nfse.api.dto.objects;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoConsultarNfseFaixa {
    @NotBlank
    @Size(min = 1, max = 15)
    private String cpfCnpj;

    @NotBlank
    private String inscrMunicipal;

    @NotBlank
    private String numeroInicial;

    @NotBlank
    private String numeroFinal;
}
