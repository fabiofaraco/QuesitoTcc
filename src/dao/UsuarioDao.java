package dao;

import interfaces.UsuarioHibernateDao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import util.PersistenceUtil;
import bean.Usuario;

public class UsuarioDao extends GenericDao<Usuario> implements UsuarioHibernateDao {
		
	public UsuarioDao(Class<Usuario> persistentClass) {
		super(persistentClass);	
	}

	@Override
	public Usuario realizaLogin(String email, String senha) {
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
}
