package br.com.nfse.api.dto.xmlElements.dadosTomador;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
	@XmlElement(name = "Telefone")
	public String telefone;
	
	@XmlElement(name = "Email")
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
