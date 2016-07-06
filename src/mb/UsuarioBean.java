package mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import bean.Perfil;
import bean.Usuario;
import dao.UsuarioDao;

@ManagedBean
public class UsuarioBean {
	private UsuarioDao dao = new UsuarioDao();
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private List<Perfil> perfis;

	
//	---------------------------------------------------------------------------------------------------
	
	public String salvar() {
		try{
			dao.incluir(usuario);
			usuario = new Usuario();
			
			FacesContext.getCurrentInstance()
 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Opera��o Realizada!", "Usu�rio inserido com sucesso!"));
		} catch(Exception e) {
			 FacesContext.getCurrentInstance()
	 			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usu�rio n�o encontrado!", "Erro no Login!"));
		}
		return null;
	}
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		try{
			dao.remover(1);
		} catch(Exception e) {
			FacesContext.getCurrentInstance()
 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Opera��o n�o realizada!", "N�o foi poss�vel excluir o usu�rio selecionado!"));
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		usuario = dao.buscar(1);
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
