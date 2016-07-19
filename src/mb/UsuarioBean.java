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
				FacesUtil.addMessageInfo("Opera��o Realizada!", "Usu�rio inserido com sucesso!");
			} else {
				dao.alterar(usuario);
				FacesUtil.addMessageInfo("Opera��o Realizada!", "Usu�rio alterado com sucesso!");
			}
		} catch(Exception e) {
			FacesUtil.addMessageInfo("Opera��o N�o Realizada!", "Um Erro Inesperado Ocorreu!");
		}
		return "lista-usuario";
	}
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		try{
			dao.remover(FacesUtil.getParameterInt("id"), Usuario.class);
			FacesUtil.addMessageInfo("Opera��o Realizada!", "Usu�rio removido com sucesso!");
		} catch(Exception e) {
			FacesContext.getCurrentInstance()
 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Opera��o n�o realizada!", "N�o foi poss�vel excluir o usu�rio selecionado!"));
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
