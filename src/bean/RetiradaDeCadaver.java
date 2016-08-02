package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RetiradaDeCadaver {

	@Column(name="retirada_cadaver")
	private String houveRetiradaDeCadaver;
	
	@Column(name="responsavel_retirada")
	private String porQuem;
	
	@Column(name="meios_utilizados_retirada")
	private String meiosUtilizados;
	
	public String getHouveRetiradaDeCadaver() {
		return houveRetiradaDeCadaver;
	}
	public void setHouveRetiradaDeCadaver(String houveRetiradaDeCadaver) {
		this.houveRetiradaDeCadaver = houveRetiradaDeCadaver;
	}
	public String getPorQuem() {
		return porQuem;
	}
	public void setPorQuem(String porQuem) {
		this.porQuem = porQuem;
	}
	public String getMeiosUtilizados() {
		return meiosUtilizados;
	}
	public void setMeiosUtilizados(String meiosUtilizados) {
		this.meiosUtilizados = meiosUtilizados;
	}
}
