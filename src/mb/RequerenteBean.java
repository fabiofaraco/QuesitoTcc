package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Requerente;
import dao.RequerenteDao;

@ManagedBean
public class RequerenteBean extends GenericoBean {
	private RequerenteDao dao = new RequerenteDao();
	private Requerente requerente = new Requerente();
	private List<Requerente> requerentes;
	
	public String salvar() {
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
		try{
			dao.remover(FacesUtil.getParameterInt("id"), Requerente.class);
			FacesUtil.addMessageInfo("Operação Realizada!", "Requerente removido com sucesso");
		} catch(Exception e) {
			FacesUtil.addMessageError("Operação Não Realizada!", "Ocorreu um Erro Inesperado");
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		requerente = dao.buscarRequerente(FacesUtil.getParameterInt("id"));
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
	
	public void setQuesito(Requerente requerente) {
		this.requerente = requerente;
	}
}
