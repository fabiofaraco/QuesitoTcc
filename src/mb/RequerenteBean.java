package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import bean.Requerente;

import comum.ManagedBeanPadrao;

import dao.RequerenteDao;

@ManagedBean
public class RequerenteBean extends ManagedBeanPadrao {
	private RequerenteDao dao = new RequerenteDao();
	private Requerente requerente = new Requerente();
	private List<Requerente> requerentes;
	
	public String salvar() {
		try{
			if(requerente.getId() == 0) {
				dao.incluir(requerente);
				requerente = new Requerente();
				addMessageInfo("Opera��o Realizada!", "Requerente inserido com sucesso");
			} else {
				dao.alterar(requerente);
				addMessageInfo("Opera��o Realizada!", "Requerente alterado com sucesso");
			}
		} catch(Exception e) {
			addMessageError("Opera��o N�o Realizada!", "Ocorreu um Erro Inesperado");
		}
		return "lista-requerente";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		try{
			dao.remover(getParameterInt("id"));
			addMessageInfo("Opera��o Realizada!", "Requerente removido com sucesso");
		} catch(Exception e) {
			addMessageError("Opera��o N�o Realizada!", "Ocorreu um Erro Inesperado");
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		int id = getParameterInt("id");
		
		requerente = dao.buscar(id);
		requerente.setId(id);
		
		return "cadastro-requerente";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public List<Requerente> getRequerentes() {
		requerentes = dao.getListaRequerentes();
		return requerentes;
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public Requerente getRequerente() {
		return requerente;
	}
	
	public void setUsuario(Requerente requerente) {
		this.requerente = requerente;
	}
}
