package br.com.nfse.api.dto.objects.consultar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoConsultarNfseFaixa {
    private String cpfCnpj;
    private String inscrMunicipal;
    private String numeroInicial;
    private String numeroFinal;
}
