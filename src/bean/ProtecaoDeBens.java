package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProtecaoDeBens {

	@Column(name="protecao_de_bens")
	private String houveProtecaoDeBens;
	
	@Column(name="responsavel_protecao_de_bens")
	private String porQuem;
	
	@Column(name="meios_utilizados_protecao_de_bens")
	private String meiosUtilizados;
	
	public String getHouveProtecaoDeBens() {
		return houveProtecaoDeBens;
	}
	public void setHouveProtecaoDeBens(String houveProtecaoDeBens) {
		this.houveProtecaoDeBens = houveProtecaoDeBens;
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
