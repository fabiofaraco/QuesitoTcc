package mb;

import interfaces.Dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Evento;
import bean.PrincipalEventoAtendido;
import dao.GenericDao;

@ManagedBean
public class EventoBean {
	
	private Evento evento = new Evento();
	private List<Evento> eventos;
	private List<PrincipalEventoAtendido> principaisEventos;
	
	public Evento getEvento() {
		return evento;
	}

	
	public void setEvento(Evento quesito) {
		this.evento = quesito;
	}

	
	public String salvar() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		try{
			if(evento.getId() == 0) {
				dao.incluir(evento);
				evento = new Evento();
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_EVENTO_INSERIDO"));
			} else {
				dao.alterar(evento);
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_EVENTO_ALTERADO"));
			}
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
		return "lista-quesito";
	}
	
	
	public void remover() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		try{
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_EVENTO_EXCLUIDO"));
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
	}
	
	
	public String carregarAlteracao() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		evento= dao.buscar(FacesUtil.getParameterInt("id"));
		return "cadastro-evento";
	}
	

	public List<Evento> getEventos() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		eventos = dao.getLista("select e from Evento e");
		return eventos;
	}


	public List<PrincipalEventoAtendido> getPrincipaisEventos() {
		Dao<PrincipalEventoAtendido> dao = new GenericDao<PrincipalEventoAtendido>(PrincipalEventoAtendido.class);
		principaisEventos = dao.getLista("select p from PrincipalEventoAtendido p");
		return principaisEventos;
	}

}
