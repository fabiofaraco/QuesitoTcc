package bean;

import javax.persistence.Embeddable;

public class ProtecaoDeBens {

	private String houveProtecaoDeBens;
	private String porQuem;
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
