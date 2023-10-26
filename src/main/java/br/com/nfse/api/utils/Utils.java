package br.com.nfse.api.utils;

import lombok.Getter;

@Getter
public class Utils {
    String urlBase = "https://www.nfse.erechim.rs.gov.br:8182/NfseService/NfseService";
    String defaultCabec = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecalho xmlns=\"http://www.abrasf.org.br/nfse.xsd\" versao=\"2.00\"><versaoDados>2.00</versaoDados></cabecalho>";
}
