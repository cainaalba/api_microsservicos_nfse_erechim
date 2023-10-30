package br.com.nfse.api.dto.xmlElements.dadosTomador;

import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	public String endereco;
	public int numero;
	public String bairro;
	public String codigoMunicipio;
	public String uf;
	public String codigoPais;
	public String cep;

	// @XmlElement(name = "Endereco")
	// public String getEndereco() {
	// 	return this.endereco;
	// }

	// @XmlElement(name = "Numero")
	// public int getNumero() {
	// 	return this.numero;
	// }

	// @XmlElement(name = "Bairro")
	// public String getBairro() {
	// 	return this.bairro;
	// }

	// @XmlElement(name = "CodigoMunicipio")
	// public String getCodigoMunicipio() {
	// 	return this.codigoMunicipio;
	// }

	// @XmlElement(name = "Uf")
	// public String getUf() {
	// 	return this.uf;
	// }

	// @XmlElement(name = "CodigoPais")
	// public String getCodigoPais() {
	// 	return this.codigoPais;
	// }

	// @XmlElement(name = "Cep")
	// public String getCep() {
	// 	return this.cep;
	// }

}
