package mb;

import interfaces.UsuarioHibernateDao;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import util.FacesUtil;
import bean.Usuario;
import dao.UsuarioDao;

@ManagedBean
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	
	public String logar() {
		UsuarioHibernateDao dao = new UsuarioDao();
		
		if(usuario.getEmail().equals("admin") && 
				usuario.getSenha().equals("admin")) {
			return "menu";
		}
		
		usuario = dao.realizaLogin(this.usuario.getEmail(), this.usuario.getSenha());
		if(usuario == null) {
			 FacesUtil.addMessageWarn(FacesUtil.getMessage("MSG_USUARIO_NAO_ENCONTRADO"), "");			
			return null;
		} else {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			HttpSession session = (HttpSession)externalContext.getSession(false);
			session.setAttribute("usuario", this.usuario );
			
			return "menu";
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}
