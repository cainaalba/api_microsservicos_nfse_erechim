package br.com.nfse.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nfse.api.dto.*;
import br.com.nfse.api.service.SoapService;

@RestController
@RequestMapping()
public class SoapController {
    private final SoapService soapService;

    public SoapController(SoapService soapService) {
        this.soapService = soapService;
    }

    @PostMapping("/GerarNfse")
    public ResponseEntity<Object> gerarNfse(@RequestBody NfseDto dados) {
        Object response = soapService.gerarNfse(dados);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/CancelarNfse")
    public ResponseEntity<Object> cancelarNfse(@RequestBody NfseDto dados) {
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/SubstituirNfse")
    public ResponseEntity<Object> substituirNfse(@RequestBody NfseDto dados) {
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/ConsultarNfseFaixa")
    public ResponseEntity<Object> consultarNfseFaixa(@RequestBody NfseDto dados) {
        Object response = soapService.consultarNfseFaixa(dados);
        return ResponseEntity.ok(response);
    }
}
