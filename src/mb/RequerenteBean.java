package mb;

import interfaces.Dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.EstadoCivil;
import bean.Requerente;
import dao.GenericDao;

@ManagedBean
public class RequerenteBean {
	private Requerente requerente = new Requerente();
	private List<Requerente> requerentes;
	private List<EstadoCivil> estadosCivis;
	
	public String salvar() {
		Dao<Requerente> dao = new GenericDao<Requerente>(Requerente.class);
		try{
			if(requerente.getId() == 0) {
				dao.incluir(requerente);
				requerente = new Requerente();
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_REQUERENTE_INSERIDO"));
			} else {
				dao.alterar(requerente);
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_REQUERENTE_ALTERADO"));
			}
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
		return "lista-requerente";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		Dao<Requerente> dao = new GenericDao<Requerente>(Requerente.class);
		try{
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_REQUERENTE_EXCLUIDO"));
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		Dao<Requerente> dao = new GenericDao<Requerente>(Requerente.class);
		requerente = dao.buscar(FacesUtil.getParameterInt("id"));
		return "cadastro-requerente";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public List<Requerente> getRequerentes() {
		Dao<Requerente> dao = new GenericDao<Requerente>(Requerente.class);
		requerentes = dao.getLista("select r from Requerente r");
		return requerentes;
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public List<EstadoCivil> getEstadosCivis() {
		Dao<EstadoCivil> dao = new GenericDao<EstadoCivil>(EstadoCivil.class);
		estadosCivis = dao.getLista("select e from EstadoCivil e");
		return estadosCivis;
	}
	
	public Requerente getRequerente() {
		return requerente;
	}
	
	public void setQuesito(Requerente requerente) {
		this.requerente = requerente;
	}
}
