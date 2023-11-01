package br.com.nfse.api.dto.xmlElements.dadosTomador;

import br.com.nfse.api.dto.xmlElements.Cnpj;
import br.com.nfse.api.dto.xmlElements.Cpf;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdentificacaoTomador {
	@XmlElement(name = "CpfCnpj")
	public Cpf cpf;

	@XmlElement(name = "CpfCnpj")
	public Cnpj cnpj;

	@XmlElement(name = "InscricaoMunicipal")
	public String inscrMunicipal;
}
