package bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requerentes")
public class Requerente {
	
	@Id @GeneratedValue
	private int id;
	
	@Column(nullable=false, length=50)
	private String nome;
	
	@Column(nullable=false, length=50)
	private String email;
	
	@Column(nullable=false, length=50)
	private String profissao;
	
	@Column(name="estado_civil", nullable=false, length=50)
	private String estadoCivil;
	
	@Column(name="data_nascimento", nullable=false)
	private Calendar dataNascimento = new GregorianCalendar();
	
	@Column(nullable=false, length=50)
	private String rg;
	
	@Column(nullable=false, length=50)
	private String cpf;
	
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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
