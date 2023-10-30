package br.com.nfse.api.service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.springframework.stereotype.Service;
import java.io.StringWriter;

@Service
public class XmlServiceImpl {

    public String convertToXml(Object payload, Class<?> classe) {
        try {
            JAXBContext context = JAXBContext.newInstance(classe);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            marshaller.marshal(payload, sw);
            return sw.toString().replaceAll("\n","").replaceAll("ns2:", "").replaceAll("ns2", "").replaceAll("xmlns:=", "xmlns=");
        } catch (jakarta.xml.bind.JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    // public boolean validateNfeSchema(String xml) {
    //     Source xsdFile = new StreamSource(new File("src//main//resources//wsdl//schema.xsd"));
    //     SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
    //     try {
    //         Schema schema = schemaFactory.newSchema(xsdFile);
    //         Validator validator = schema.newValidator();
    //         validator.validate(new StreamSource(new StringReader(xml)));
    //         return true;
    //     } catch (SAXException | IOException e) {
    //         e.printStackTrace();
    //         return false;
    //     }
    // }
}
