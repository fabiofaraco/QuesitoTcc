package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ResponsabilidadePeloBem {
	
	@Column(name="quanto_ao_continente")
	private String quantoAoContinente;
	
	@Column(name="quanto_ao_conteudo")
	private String quantoAoConteudo;
	
	public String getQuantoAoContinente() {
		return quantoAoContinente;
	}
	public void setQuantoAoContinente(String quantoAoContinente) {
		this.quantoAoContinente = quantoAoContinente;
	}
}
