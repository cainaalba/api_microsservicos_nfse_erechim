package br.com.nfse.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nfse.api.dto.GerarNfseDto;
import br.com.nfse.api.service.SoapService;
import br.com.nfse.api.stubs.GerarNfse;


@RestController
@RequestMapping()
public class SoapController {
    private final SoapService soapService;

    public SoapController(SoapService soapService) {
        this.soapService = soapService;
    }

    @GetMapping("/GerarNfse")
    public ResponseEntity<Object> callSoapService(@RequestBody GerarNfseDto dados) {
        Object response = soapService.gerarNfse(dados);
        return ResponseEntity.ok(response);
    }
}
