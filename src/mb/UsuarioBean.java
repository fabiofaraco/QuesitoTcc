package mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import bean.Perfil;
import bean.Usuario;
import dao.UsuarioDao;

@ManagedBean
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private List<Perfil> perfis;
	
//	---------------------------------------------------------------------------------------------------	
	
	public List<Perfil> getPerfis() {
		UsuarioDao dao = new UsuarioDao();
		perfis = dao.getListaPerfis();
		return perfis;
	}
	
//	---------------------------------------------------------------------------------------------------	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
	
}
