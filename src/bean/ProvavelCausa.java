package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ProvavelCausa {

	@Column(name="como_se_originou")
	private String comoSeOriginou;
	
	@Column(name="onde_se_originou")
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
