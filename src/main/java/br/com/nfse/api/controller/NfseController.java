package br.com.nfse.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nfse.api.dto.objects.DtoConsultarNfseFaixa;
import br.com.nfse.api.dto.objects.DtoGerarNfseEnvio;
import br.com.nfse.api.service.SoapService;
import jakarta.validation.Valid;

@RestController
@RequestMapping()
public class NfseController {
    private final SoapService soapService;

    public NfseController(SoapService soapService) {
        this.soapService = soapService;
    }

    @PostMapping("/GerarNfse")
    public ResponseEntity<Object> gerarNfse(@RequestBody @Valid DtoGerarNfseEnvio dados) {
        Object response = soapService.gerarNfse(dados);
        return ResponseEntity.ok(response);
    }

    // @PostMapping("/CancelarNfse")
    // public ResponseEntity<Object> cancelarNfse(@RequestBody DtoGerarNfseEnvio dados) {
    //     return ResponseEntity.ok("OK");
    // }

    // @PostMapping("/SubstituirNfse")
    // public ResponseEntity<Object> substituirNfse(@RequestBody DtoGerarNfseEnvio dados) {
    //     return ResponseEntity.ok("OK");
    // }

    @GetMapping("/ConsultarNfseFaixa")
    public ResponseEntity<Object> consultarNfseFaixa(@RequestBody @Valid DtoConsultarNfseFaixa dados) throws RuntimeException  {
        Object response = soapService.consultarNfseFaixa(dados);
        return ResponseEntity.ok(response);
    }
}
