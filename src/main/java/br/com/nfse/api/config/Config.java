package br.com.nfse.api.config;

import java.io.FileInputStream;
import java.security.KeyStore;

import javax.net.ssl.KeyManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

import br.com.nfse.api.utils.Utils;

@Configuration
public class Config {
    Utils utils = new Utils();

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate sWebServiceTemplate = new WebServiceTemplate();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("br.com.nfse.api.stubs"); // Pacote com as classes geradas a partir do XML do serviço SOAP

        HttpsUrlConnectionMessageSender hMessageSender = new HttpsUrlConnectionMessageSender();
        hMessageSender.setKeyManagers(keyManager());
        
        sWebServiceTemplate.setMarshaller(marshaller);
        sWebServiceTemplate.setUnmarshaller(marshaller);
        sWebServiceTemplate.setDefaultUri(utils.getUrlBase());
        sWebServiceTemplate.setMessageSender(hMessageSender);
        return sWebServiceTemplate;
    }

    //CERTIFICADO
    public KeyManager[] keyManager() {
        KeyStore keyStore;
        try {
            keyStore = KeyStore.getInstance("pkcs12");
            FileInputStream fileInputStream = new FileInputStream("src//main//resources//certs//client.pfx");
            keyStore.load(fileInputStream, "safeweb".toCharArray());
            return new KeyManager[] { new SunX509KeyManagerImpl(keyStore, "safeweb".toCharArray()) };
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
