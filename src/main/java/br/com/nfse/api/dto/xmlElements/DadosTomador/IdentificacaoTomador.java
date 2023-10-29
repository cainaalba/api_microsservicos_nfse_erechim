package br.com.nfse.api.dto.xmlElements.DadosTomador;

import lombok.*;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdentificacaoTomador {
	public CpfCnpj cpfCnpj;
	public String inscrMunicipal;

	// @XmlElement(name = "CpfCnpj")
	// public CpfCnpj getCpfCnpj() {
	// 	return this.cpfCnpj;
	// }

	// @XmlElement(name = "InscricaoMunicipal")
	// public String getInscrMunicipal() {
	// 	return this.inscrMunicipal;
	// }

}
