package br.com.nfse.api.dto.objects.cancelar;

import br.com.nfse.api.dto.emun.CodigoCancelamento;

import br.com.nfse.api.dto.xmlElements.Cnpj;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DtoCancelarNfse {
    private String nfse;
    private Cnpj cpfCnpj;
    private String inscrMunicipal;
    private String codigoMunicipio;
    private CodigoCancelamento codigoCancelamento;
}
