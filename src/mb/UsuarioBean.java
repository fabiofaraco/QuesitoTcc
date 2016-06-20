package mb;

import java.util.List;

import bean.Usuario;

public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	
//	---------------------------------------------------------------------------------------------------	
	
	
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
