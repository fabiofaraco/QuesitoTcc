package mb;

import interfaces.Dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Evento;
import dao.GenericDao;

@ManagedBean
public class EventoBean {
	
	private Evento quesito = new Evento();
	private List<Evento> quesitos;
	
	public String salvar() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		try{
			if(quesito.getId() == 0) {
				dao.incluir(quesito);
				quesito = new Evento();
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_EVENTO_INSERIDO"));
			} else {
				dao.alterar(quesito);
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_EVENTO_ALTERADO"));
			}
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
		return "lista-quesito";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		try{
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_EVENTO_EXCLUIDO"));
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		quesito= dao.buscar(FacesUtil.getParameterInt("id"));
		return "cadastro-quesito";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public List<Evento> getQuesitos() {
		Dao<Evento> dao = new GenericDao<Evento>(Evento.class);
		quesitos = dao.getLista("select q from Quesito q");
		return quesitos;
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public Evento getQuesito() {
		return quesito;
	}
	
	public void setQuesito(Evento quesito) {
		this.quesito = quesito;
	}

}
