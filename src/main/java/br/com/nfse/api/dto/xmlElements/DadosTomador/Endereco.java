package br.com.nfse.api.dto.xmlElements.dadosTomador;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	@XmlElement(name = "Endereco")
	public String endereco;

	@XmlElement(name = "Numero")
	public int numero;

	@XmlElement(name = "Bairro")
	public String bairro;

	@XmlElement(name = "CodigoMunicipio")
	public String codigoMunicipio;

	@XmlElement(name = "Uf")
	public String uf;

	@XmlElement(name = "CodigoPais")
	public String codigoPais;

	@XmlElement(name = "Cep")
	public String cep;

	// public String getEndereco() {
	// return this.endereco;
	// }

	// public int getNumero() {
	// return this.numero;
	// }

	// public String getBairro() {
	// return this.bairro;
	// }

	// public String getCodigoMunicipio() {
	// return this.codigoMunicipio;
	// }

	// @XmlElement(name = "Uf")
	// public String getUf() {
	// return this.uf;
	// }

	// @XmlElement(name = "CodigoPais")
	// public String getCodigoPais() {
	// return this.codigoPais;
	// }

	// @XmlElement(name = "Cep")
	// public String getCep() {
	// return this.cep;
	// }

}
