package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import bean.Usuario;

public class UsuarioDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("quesitoSocorro");
	private EntityManager manager = factory.createEntityManager(); 
	
	public Usuario buscarUsuarioLogin(String email, String senha) {
		try {
			Query query = manager.createQuery("select u from Usuario u where u.email = :email and u.senha = :senha");
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			
			Usuario usuario = (Usuario)query.getSingleResult();
			
			return usuario;
		} catch(NoResultException e) {
			e.getMessage();
			return null;
		} finally {
			manager.close();
		}
	}
}
