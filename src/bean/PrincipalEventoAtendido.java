package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="principal_evento")
public class PrincipalEventoAtendido {

	@Id
	@GeneratedValue
	private int id;
	private String descricao;
	
	@Column(name="descricao_outro")
	private String descricaoOutro;

	public String getDescricaoOutro() {
		return descricaoOutro;
	}

	public void setDescricaoOutro(String descricaoOutro) {
		this.descricaoOutro = descricaoOutro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
