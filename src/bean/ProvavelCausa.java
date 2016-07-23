package bean;

import javax.persistence.Embeddable;


public class ProvavelCausa {

	private String comoSeOriginou;
	private String ondeSeOriginou;
	
	public String getComoSeOriginou() {
		return comoSeOriginou;
	}
	public void setComoSeOriginou(String comoSeOriginou) {
		this.comoSeOriginou = comoSeOriginou;
	}
	public String getOndeSeOriginou() {
		return ondeSeOriginou;
	}
	public void setOndeSeOriginou(String ondeSeOriginou) {
		this.ondeSeOriginou = ondeSeOriginou;
	}
	
	
}
