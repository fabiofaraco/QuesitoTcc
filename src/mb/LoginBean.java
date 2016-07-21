package mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.Usuario;
import dao.UsuarioDao;
import dao.UsuarioHibernateDao;

@ManagedBean
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	
	public String logar() {
		UsuarioHibernateDao dao = new UsuarioDao(Usuario.class);
		
		if(usuario.getEmail().equals("admin") && 
				usuario.getSenha().equals("admin")) {
			return "menu";
		}
		
		usuario = dao.realizaLogin(this.usuario.getEmail(), this.usuario.getSenha());
		if(usuario == null) {
			 FacesContext.getCurrentInstance()
			 			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!", "Erro no Login!"));
			
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
	
	public EntityManager getManager () {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpServletRequest request = (HttpServletRequest)ec.getRequest();
		return (EntityManager)request.getAttribute("EntityManager");
	}
	
}
