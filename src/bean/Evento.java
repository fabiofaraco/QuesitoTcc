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
	
	@Column(name="DT_EVENTO")
	private Calendar dataEvento = Calendar.getInstance();
	
	@Embedded
	private Endereco endereco = new Endereco();

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
}
