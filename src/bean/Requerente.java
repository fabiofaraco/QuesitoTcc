package bean;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REQUERENTES")
public class Requerente {
	
	@Id 
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PROFISSAO")
	private String profissao;
	
	@ManyToOne
	@JoinColumn(name="ID_ESTADO_CIVIL")
	private EstadoCivil estadoCivil = new EstadoCivil();
	
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento = Calendar.getInstance();
	
	@Column(name="RG")
	private Long rg;
	
	@Column(name="CPF")
	private Long cpf;
	
	@Embedded
	private Endereco endereco = new Endereco();
	
	@Embedded
	private Telefone telefone = new Telefone();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
