package bean;

import javax.persistence.Embeddable;


public class AcaoDeSocorro {

	private String situacaoDoEventoAchegadaDoSocorro;
	private String comoMaterialFoiEstabelecido;
	
	public String getSituacaoDoEventoAchegadaDoSocorro() {
		return situacaoDoEventoAchegadaDoSocorro;
	}
	public void setSituacaoDoEventoAchegadaDoSocorro(
			String situacaoDoEventoAchegadaDoSocorro) {
		this.situacaoDoEventoAchegadaDoSocorro = situacaoDoEventoAchegadaDoSocorro;
	}
	public String getComoMaterialFoiEstabelecido() {
		return comoMaterialFoiEstabelecido;
	}
	public void setComoMaterialFoiEstabelecido(String comoMaterialFoiEstabelecido) {
		this.comoMaterialFoiEstabelecido = comoMaterialFoiEstabelecido;
	}
	
	
}
