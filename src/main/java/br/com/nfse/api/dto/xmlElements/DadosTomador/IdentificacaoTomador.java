package br.com.nfse.api.dto.xmlElements.dadosTomador;

import br.com.nfse.api.dto.xmlElements.Cpf;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdentificacaoTomador {
	@XmlElement(name = "CpfCnpj")
	public Cpf cpfCnpj;

	@XmlElement(name = "InscricaoMunicipal")
	public String inscrMunicipal;

	// public CpfCnpj getCpfCnpj() {
	// 	return this.cpfCnpj;
	// }

	// public String getInscrMunicipal() {
	// 	return this.inscrMunicipal;
	// }

}
