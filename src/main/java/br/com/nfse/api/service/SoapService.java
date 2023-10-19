package br.com.nfse.api.service;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapService {

    private final WebServiceTemplate webServiceTemplate;

    public SoapService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public Object invokeSoapService(Object request) {
        // Use o webServiceTemplate para fazer chamadas ao serviço SOAP
        Object response = webServiceTemplate.marshalSendAndReceive(request);
        return response;
    }
}
