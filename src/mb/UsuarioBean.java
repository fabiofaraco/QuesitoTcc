package mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import util.FacesUtil;
import bean.Perfil;
import bean.Usuario;
import dao.Dao;
import dao.GenericDao;

@ManagedBean
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private List<Perfil> perfis;

	
//	---------------------------------------------------------------------------------------------------
	
	public String salvar() {
		try{
			Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
			
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
			Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
			
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo("Operação Realizada!", "Usuário removido com sucesso!");
		} catch(Exception e) {
			FacesContext.getCurrentInstance()
 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Operação não realizada!", "Não foi possível excluir o usuário selecionado!"));
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		
		usuario = dao.buscar(FacesUtil.getParameterInt("id"));
		return "cadastro-usuario";
	}
	
//	---------------------------------------------------------------------------------------------------	
	
	public List<Perfil> getPerfis() {
		Dao<Perfil> dao = new GenericDao<Perfil>(Perfil.class);
		
		perfis = dao.getLista("select p from Perfil p");
		return perfis;
	}
	
//	---------------------------------------------------------------------------------------------------	
	
	public List<Usuario> getUsuarios() {
		Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		
		usuarios = dao.getLista("select u from Usuario u");
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
