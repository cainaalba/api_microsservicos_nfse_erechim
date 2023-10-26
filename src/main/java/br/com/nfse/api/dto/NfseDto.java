package br.com.nfse.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NfseDto {
    // private String nfseCabecMsg; //CABECALHO DEFAULT DEFINIDO EM Utils --- ver
    private String nfseDadosMsg;
}
