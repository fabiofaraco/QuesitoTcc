package bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Tripulacao {
	
	@Column(name="nome_tripulacao")
	private String nome;
	
	@Column(name="posicao_tripulacao")
	private String posicao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
}
