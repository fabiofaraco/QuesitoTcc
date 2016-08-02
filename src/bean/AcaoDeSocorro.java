package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AcaoDeSocorro {

	@Column(name="situacao")
	private String situacaoDoEventoAchegadaDoSocorro;
	
	@Column(name="como_material_estabelecido")
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
