package mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import util.FacesUtil;
import bean.Perfil;
import bean.Usuario;
import dao.UsuarioDao;

@ManagedBean
public class UsuarioBean extends GenericoBean {
	private UsuarioDao dao = new UsuarioDao();
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private List<Perfil> perfis;

	
//	---------------------------------------------------------------------------------------------------
	
	public String salvar() {
		try{
			if(usuario.getId() == 0) {
				dao.incluir(usuario);
				usuario = new Usuario();
				FacesUtil.addMessageInfo("Operação Realizada!", "Usuário inserido com sucesso!");
			} else {
				dao.alterar(usuario);
				FacesUtil.addMessageInfo("Operação Realizada!", "Usuário alterado com sucesso!");
			}
		} catch(Exception e) {
			FacesUtil.addMessageInfo("Operação Não Realizada!", "Um Erro Inesperado Ocorreu!");
		}
		return "lista-usuario";
	}
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		try{
			dao.remover(FacesUtil.getParameterInt("id"), Usuario.class);
			FacesUtil.addMessageInfo("Operação Realizada!", "Usuário removido com sucesso!");
		} catch(Exception e) {
			FacesContext.getCurrentInstance()
 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Operação não realizada!", "Não foi possível excluir o usuário selecionado!"));
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		usuario = dao.buscarUsuario(FacesUtil.getParameterInt("id"));
		return "cadastro-usuario";
	}
	
//	---------------------------------------------------------------------------------------------------	
	
	public List<Perfil> getPerfis() {
		perfis = dao.getListaPerfis();
		return perfis;
	}
	
//	---------------------------------------------------------------------------------------------------	
	
	public List<Usuario> getUsuarios() {
		usuarios = dao.getListaUsuarios();
		return usuarios;
	}

//	---------------------------------------------------------------------------------------------------
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
