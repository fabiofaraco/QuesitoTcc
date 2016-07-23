package bean;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

public class NaturezaDoBem {
	
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
