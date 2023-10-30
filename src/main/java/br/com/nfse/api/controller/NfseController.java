package br.com.nfse.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfse;
import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfseEnvio;
import br.com.nfse.api.dto.objects.consultar.DtoConsultarNfseEnvio;
import br.com.nfse.api.dto.objects.gerar.DtoGerarNfseEnvio;
import br.com.nfse.api.dto.objects.substituir.DtoSubstituirNfse;
import br.com.nfse.api.dto.objects.substituir.DtoSubstituirNfseEnvio;
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
    public ResponseEntity<Object> gerarNfse(@RequestBody @Valid DtoGerarNfseEnvio dados) throws Exception {
        return soapService.gerarNfse(dados);
    }

    @PostMapping("/CancelarNfse")
    public ResponseEntity<Object> cancelarNfse(@RequestBody @Valid DtoCancelarNfseEnvio dados) throws Exception {
        return soapService.cancelarNfse(dados);
    }

    @PostMapping("/SubstituirNfse")
    public ResponseEntity<Object> substituirNfse(@RequestBody @Valid DtoSubstituirNfseEnvio dados) throws Exception {
        return soapService.substituirNfse(dados);
    }

    @GetMapping("/ConsultarNfseFaixa")
    public ResponseEntity<Object> consultarNfse(@RequestBody @Valid DtoConsultarNfseEnvio dados) throws Exception  {
        return soapService.consultarNfse(dados);
    }
}
