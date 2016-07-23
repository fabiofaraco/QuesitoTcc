package bean;

import javax.persistence.Embeddable;

public class Salvamento {

	private String houveSalvamento;
	private String porQuem;
	private String meiosUtilizados;
	
	public String getHouveSalvamento() {
		return houveSalvamento;
	}
	public void setHouveSalvamento(String houveSalvamento) {
		this.houveSalvamento = houveSalvamento;
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
