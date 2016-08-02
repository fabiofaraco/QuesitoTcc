package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salvamento {

	@Column(name="houve_salvamento")
	private String houveSalvamento;
	
	@Column(name="responsavel_salvamento")
	private String porQuem;
	
	@Column(name="meios_utilizados_salvamento")
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
