package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone {
	
	@Column(name="TEL_RES")
	private Long telResidencial;
	
	@Column(name="TEL_CEL")
	private Long telCelular;

	public Long getTelResidencial() {
		return telResidencial;
	}

	public void setTelResidencial(Long telResidencial) {
		this.telResidencial = telResidencial;
	}

	public Long getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(Long telCelular) {
		this.telCelular = telCelular;
	}
	
}
