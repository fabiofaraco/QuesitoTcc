package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROTOCOLOS")
public class Protocolo {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="ID_REQUERENTE")
	private Requerente requerente = new Requerente();
	
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento = new Evento();
	
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Requerente getRequerente() {
		return requerente;
	}
	public void setRequerente(Requerente requerente) {
		this.requerente = requerente;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
