package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MovimentoDeMaterial {
	
	@Column(name="socorro_chegou_primeiro")
	private String socorroQuePrimeiroChegouAoLocal;
	
	@Column(name="outros_socorros")
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
