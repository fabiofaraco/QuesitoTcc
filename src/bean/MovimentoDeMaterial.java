package bean;

import javax.persistence.Embeddable;

public class MovimentoDeMaterial {
	
	private String socorroQuePrimeiroChegouAoLocal;
	private String outrosSocorros;
	
	public String getSocorroQuePrimeiroChegouAoLocal() {
		return socorroQuePrimeiroChegouAoLocal;
	}
	public void setSocorroQuePrimeiroChegouAoLocal(
			String socorroQuePrimeiroChegouAoLocal) {
		this.socorroQuePrimeiroChegouAoLocal = socorroQuePrimeiroChegouAoLocal;
	}
	public String getOutrosSocorros() {
		return outrosSocorros;
	}
	public void setOutrosSocorros(String outrosSocorros) {
		this.outrosSocorros = outrosSocorros;
	}
}
