package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import bean.Perfil;
import bean.Usuario;
import conexao.PersistenceUtil;

public class UsuarioDao {
	
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
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try{
			Query query = manager.createQuery("select p from Perfil p");
			return query.getResultList();
		} finally {
			manager.close();
		}
	}
}
