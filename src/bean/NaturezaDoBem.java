package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class NaturezaDoBem {
	
	@Column(name="especie_bem")
	private String especieDoBem;
	
	@ManyToOne
	private FinalidadeDoBem finalidadeDoBem = new FinalidadeDoBem();
	
	public String getEspecieDoBem() {
		return especieDoBem;
	}
	public void setEspecieDoBem(String especieDoBem) {
		this.especieDoBem = especieDoBem;
	}
	public FinalidadeDoBem getFinalidadeDoBem() {
		return finalidadeDoBem;
	}
	public void setFinalidadeDoBem(FinalidadeDoBem finalidadeDoBem) {
		this.finalidadeDoBem = finalidadeDoBem;
	}
}
