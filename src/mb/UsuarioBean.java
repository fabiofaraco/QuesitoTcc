package mb;

import interfaces.Dao;

import java.util.List;

import javax.faces.bean.ManagedBean;

import util.FacesUtil;
import bean.Perfil;
import bean.Usuario;
import dao.GenericDao;

@ManagedBean
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private List<Perfil> perfis;

	public String salvar() {
		try{
			Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
			
			if(usuario.getId() == 0) {
				dao.incluir(usuario);
				usuario = new Usuario();
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_USUARIO_INSERIDO"));
			} else {
				dao.alterar(usuario);
				FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_USUARIO_ALTERADO"));
			}
		} catch(Exception e) {
			FacesUtil.addMessageError();
		}
		return "lista-usuario";
	}

//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		try{
			Dao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_USUARIO_EXCLUIDO"));
		} catch(Exception e) {
			FacesUtil.addMessageError();
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
