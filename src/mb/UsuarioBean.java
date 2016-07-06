package mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import comum.ManagedBeanPadrao;

import bean.Perfil;
import bean.Usuario;
import dao.UsuarioDao;

@ManagedBean
public class UsuarioBean extends ManagedBeanPadrao {
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
				
				FacesContext.getCurrentInstance()
	 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operação Realizada!", "Usuário inserido com sucesso!"));
			} else {
				dao.alterar(usuario);
				
				FacesContext.getCurrentInstance()
	 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operação Realizada!", "Usuário alterado com sucesso!"));
			}
		} catch(Exception e) {
			 FacesContext.getCurrentInstance()
	 			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!", "Erro no Login!"));
		}
		return "lista-usuario";
	}
//	---------------------------------------------------------------------------------------------------
	
	public void remover() {
		try{
			dao.remover(getParameterInt("id"));
			
			FacesContext.getCurrentInstance()
				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Operação realizada!", "Usuário Removido com sucesso!"));
		} catch(Exception e) {
			FacesContext.getCurrentInstance()
 				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Operação não realizada!", "Não foi possível excluir o usuário selecionado!"));
		}
	}
	
//	---------------------------------------------------------------------------------------------------
	
	public String carregarAlteracao() {
		int id = getParameterInt("id");
		
		usuario = dao.buscar(id);
		usuario.setId(id);
		
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
