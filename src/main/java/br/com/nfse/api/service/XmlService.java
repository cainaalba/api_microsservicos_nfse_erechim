package br.com.nfse.api.service;

public interface XmlService {
    String convertToXml(Object payload);
    boolean validateNfeSchema(String xml);
}
