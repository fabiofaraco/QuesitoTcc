package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import util.PersistenceUtil;
import bean.Perfil;
import bean.Usuario;

public class UsuarioDao extends GenericoDao {
	
	public Usuario buscarUsuarioLogin(String email, String senha) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select u from Usuario u where u.email = :email and u.senha = :senha");
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			
			Usuario usuario = (Usuario)query.getSingleResult();
			
			return usuario;
		} catch(NoResultException e) {
			return null;
		} finally {
			manager.close();
		}
	}
	
//	---------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("unchecked")
	public List<Perfil> getListaPerfis() {
		return (List<Perfil>)(Object)this.getLista("select p from Perfil p");
	}

//	---------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getListaUsuarios() {
		return (List<Usuario>)(Object)this.getLista("select u from Usuario u");
	}
	
//	---------------------------------------------------------------------------------------------------------
	
	public Usuario buscarUsuario(int id) {
		return (Usuario) this.buscar(id, Usuario.class);
	}	
}
