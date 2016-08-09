package interfaces;

import java.util.ArrayList;
import java.util.Calendar;

import bean.Evento;
import bean.Protocolo;
import bean.Requerente;

public interface ProtocoloHibernateDao extends Dao<Protocolo> {
	public ArrayList<Evento> buscarEventoData(Calendar dataEvento);
	public Requerente buscarDadosRequerente(Long cpf);
}
