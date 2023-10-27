package br.com.nfse.api.dto.xmlElements.DadosTomador;

import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
	public String telefone;
	public String email;

	// @XmlElement(name = "Telefone")
	// public String getTelefone() {
	// 	return this.telefone;
	// }

	// @XmlElement(name = "Email")
	// public String getEmail() {
	// 	return this.email;
	// }

}
