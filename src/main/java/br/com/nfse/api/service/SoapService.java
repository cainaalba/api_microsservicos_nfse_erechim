package br.com.nfse.api.service;

import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import br.com.nfse.api.dto.NfseDto;
import br.com.nfse.api.stubs.ConsultarNfseFaixa;
import br.com.nfse.api.stubs.GerarNfse;
import br.com.nfse.api.utils.Utils;

@Service
public class SoapService {
    private Utils utils = new Utils();

    private final WebServiceTemplate webServiceTemplate;
    private final XmlServiceImpl xmlServiceImpl;

    public SoapService(WebServiceTemplate webServiceTemplate,
            XmlServiceImpl xmlServiceImpl) {
        this.webServiceTemplate = webServiceTemplate;
        this.xmlServiceImpl = xmlServiceImpl;
    }

    public Object invokeSoapService(Object request) {
        // Use o webServiceTemplate para fazer chamadas ao serviço SOAP
        Object response = webServiceTemplate.marshalSendAndReceive(request);
        return response;
    }

    public ResponseEntity<Object> gerarNfse(NfseDto dados) {
        GerarNfse request = new GerarNfse();
        request.setNfseCabecMsg(utils.getDefaultCabec());
        request.setNfseDadosMsg(dados.getNfseDadosMsg());

        // String xmlConvert = xmlServiceImpl.convertToXml(request.getNfseDadosMsg());
        if (xmlServiceImpl.validateNfeSchema(request.getNfseDadosMsg())) {
            return ResponseEntity.status(HttpStatus.OK).body(invokeSoapService(request));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao validar o XML!");
        }
    }

    public Object consultarNfseFaixa(NfseDto dados) {
        ConsultarNfseFaixa request = new ConsultarNfseFaixa();
        request.setNfseCabecMsg(utils.getDefaultCabec());
        request.setNfseDadosMsg(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ConsultarNfseFaixaEnvio xmlns=\"http://www.abrasf.org.br/nfse.xsd\"><Prestador><CpfCnpj><Cnpj>93388031000142</Cnpj></CpfCnpj><InscricaoMunicipal>10911</InscricaoMunicipal></Prestador><Faixa><NumeroNfseInicial>141206</NumeroNfseInicial><NumeroNfseFinal>141206</NumeroNfseFinal></Faixa><Pagina>1</Pagina></ConsultarNfseFaixaEnvio>");
        return invokeSoapService(request);
    }
}
