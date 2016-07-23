package mb;

import interfaces.Dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Requerente;
import dao.GenericDao;

@ManagedBean
public class RequerenteBean {
	private Requerente requerente = new Requerente();
	private List<Requerente> requerentes;
	
	public String salvar() {
		Dao<Requerente> dao = new GenericDao<Requerente>(Requerente.class);
		
		try{
			if(requerente.getId() == 0) {
				dao.incluir(requerente);
				requerente = new Requerente();
				FacesUtil.addMessageInfo("Operação Realizada!", "Requerente inserido com sucesso");
			} else {
				dao.alterar(requerente);
				FacesUtil.addMessageInfo("Operação Realizada!", "Requerente alterado com sucesso");
			}
		} catch(Exception e) {
			FacesUtil.addMessageError("Operação Não Realizada!", "Ocorreu um Erro Inesperado");
		}
		return "lista-requerente";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		Dao<Requerente> dao = new GenericDao<Requerente>(Requerente.class);
		
		try{
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo("Operação Realizada!", "Requerente removido com sucesso");
		} catch(Exception e) {
			FacesUtil.addMessageError("Operação Não Realizada!", "Ocorreu um Erro Inesperado");
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
	
	public Requerente getRequerente() {
		return requerente;
	}
	
	public void setQuesito(Requerente requerente) {
		this.requerente = requerente;
	}
}
