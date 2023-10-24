package br.com.nfse.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GerarNfseDto {
    private String nfseCabecMsg;
    private String nfseDadosMsg;
}
