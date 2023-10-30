package br.com.nfse.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.nfse.api.utils.XmlUtil;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("src//main//resources//certs//.pwcert");
			String pwEncoded = Files.readAllLines(path).get(0);
			
			//DECODE BASE64
			byte[] pwDecoded =  java.util.Base64.getDecoder().decode(pwEncoded);
			String decodedString = new String(pwDecoded);

			XmlUtil.setPwCert(decodedString);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		SpringApplication.run(ApiApplication.class, args);
	}
}
