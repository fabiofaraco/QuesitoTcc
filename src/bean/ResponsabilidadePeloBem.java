package bean;

import javax.persistence.Embeddable;

public class ResponsabilidadePeloBem {
	
	private String quantoAoContinente;
	private String outrosSocorros;
	
	public String getQuantoAoContinente() {
		return quantoAoContinente;
	}
	public void setQuantoAoContinente(String quantoAoContinente) {
		this.quantoAoContinente = quantoAoContinente;
	}
	public String getOutrosSocorros() {
		return outrosSocorros;
	}
	public void setOutrosSocorros(String outrosSocorros) {
		this.outrosSocorros = outrosSocorros;
	}
}
