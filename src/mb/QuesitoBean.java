package mb;

import interfaces.Dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Quesito;
import dao.GenericDao;

@ManagedBean
public class QuesitoBean {
	
	private Quesito quesito = new Quesito();
	private List<Quesito> quesitos;
	
	public String salvar() {
		Dao<Quesito> dao = new GenericDao<Quesito>(Quesito.class);
		
		try{
			if(quesito.getId() == 0) {
				dao.incluir(quesito);
				quesito = new Quesito();
				FacesUtil.addMessageInfo("Operação Realizada!", "Quesito inserido com sucesso");
			} else {
				dao.alterar(quesito);
				FacesUtil.addMessageInfo("Operação Realizada!", "Quesito alterado com sucesso");
			}
		} catch(Exception e) {
			FacesUtil.addMessageError("Operação Não Realizada!", "Ocorreu um Erro Inesperado");
		}
		return "lista-quesito";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		Dao<Quesito> dao = new GenericDao<Quesito>(Quesito.class);
		
		try{
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo("Operação Realizada!", "Quesito removido com sucesso");
		} catch(Exception e) {
			FacesUtil.addMessageError("Operação Não Realizada!", "Ocorreu um Erro Inesperado");
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		Dao<Quesito> dao = new GenericDao<Quesito>(Quesito.class);
		
		quesito= dao.buscar(FacesUtil.getParameterInt("id"));
		return "cadastro-quesito";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public List<Quesito> getQuesitos() {
		Dao<Quesito> dao = new GenericDao<Quesito>(Quesito.class);
		
		quesitos = dao.getLista("select q from Quesito q");
		return quesitos;
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public Quesito getQuesito() {
		return quesito;
	}
	
	public void setQuesito(Quesito quesito) {
		this.quesito = quesito;
	}

}
