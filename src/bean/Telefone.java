package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone {
	
	@Column(name="tel_residencial")
	private String telResidencial;
	
	@Column(name="tel_celular")
	private String telCelular;

	public String getTelResidencial() {
		return telResidencial;
	}

	public void setTelResidencial(String telResidencial) {
		this.telResidencial = telResidencial;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
}
