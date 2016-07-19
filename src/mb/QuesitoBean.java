package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Quesito;
import dao.QuesitoDao;

@ManagedBean
public class QuesitoBean extends GenericoBean {
	private QuesitoDao dao = new QuesitoDao();
	private Quesito quesito = new Quesito();
	private List<Quesito> quesitos;
	
	public String salvar() {
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
		try{
			dao.remover(FacesUtil.getParameterInt("id"), Quesito.class);
			FacesUtil.addMessageInfo("Operação Realizada!", "Quesito removido com sucesso");
		} catch(Exception e) {
			FacesUtil.addMessageError("Operação Não Realizada!", "Ocorreu um Erro Inesperado");
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		quesito= dao.buscarQuesito(FacesUtil.getParameterInt("id"));
		return "cadastro-quesito";
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public List<Quesito> getQuesitos() {
		quesitos = dao.getListaQuesitos();
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
