package bean;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENTOS")
public class Evento {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="OBM")
	private Long obm;
	
	@Column(name="DT_EVENTO")
	private Calendar dataEvento = Calendar.getInstance();
	
	@Embedded
	private Endereco endereco = new Endereco();
	
	@Column(name="ESPECIE_BEM")
	private String especie;
	
	@Column(name="FINALIDADE")
	private String finalidade;
	
	/*private String responsabilidadeQuantoAoContinente;
	private String responsabilidadeQuantoAoConteudo;
	private String tripulacao;
	private String comoSeOriginou;
	private String ondeSeOriginou;
	private String situacaoDoEventoChegada;
	private String estabelecimentoDeMaterial;
	private String salvamento;
	private String retiradaDeCadaver;
	private String protecaoDeBens;
	private String iluminacao;
	private String arrombamento;
	private String bensMoveisEimoveisAtingidos;
	private String prejuizoQuantoAoContinente;
	private String prejuizoQuantoAoConteudo;
	private String materialEmpregadoDoCorpo;
	private String materialEmpregadoOutros;
	private String materialDoCorpoDestruidoOuAvariado;
	private String valoresRecolhidos;
	private String suprimentoDeAgua;
	private String acidente;
	private String atendimentoMedico;
	private String auxiliosEstranhosAoCorpo;
	private String pessoalQueTomouParteDosTrabalhos;
	private String comparecimentoDeAutoridades;
	private String aQuemFoiEntregueLocal;
	private String outrosEsclarecimentos;*/
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Calendar dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getObm() {
		return obm;
	}

	public void setObm(Long obm) {
		this.obm = obm;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
}
