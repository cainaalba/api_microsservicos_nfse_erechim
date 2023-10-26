package br.com.nfse.api.service;

import br.com.nfse.api.dto.Nfse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

@Slf4j
@Service
public class XmlServiceImpl implements XmlService {

    @Override
    public String convertToXml(Object payload) {
        try {
            JAXBContext context = JAXBContext.newInstance(Nfse.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            marshaller.marshal(payload, sw);

            System.out.println(sw.toString());

            return sw.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean validateNfeSchema(String xml) {
        Source xsdFile = new StreamSource(new File("/src/main/resources/wsdl/schema.xsd"));
        SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        try {
            Schema schema = schemaFactory.newSchema(xsdFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new StringReader(xml)));
            log.info("O XML é válido em relação ao esquema.");
            return true;
        } catch (SAXException | IOException e) {
            // throw new RuntimeException(e);
            return false;
        }
    }
}
