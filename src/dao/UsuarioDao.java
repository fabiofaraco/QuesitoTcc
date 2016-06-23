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
	
//	---------------------------------------------------------------------------------------------------------
	
	public void incluir(Usuario usuario) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
	}
	
//	---------------------------------------------------------------------------------------------------------
	
	public void alterar(Usuario usuario) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.merge(usuario);
		manager.getTransaction().commit();
		manager.close();
	}
	
//	---------------------------------------------------------------------------------------------------------
	
	public void remover(int id) {
		Usuario usuario = buscar(id);
		EntityManager manager = PersistenceUtil.getEntityManager();
		manager.remove(usuario);
	}
	
//	---------------------------------------------------------------------------------------------------------
	
	public Usuario buscar(int id) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			return manager.find(Usuario.class, id);
		} finally {
			manager.close();
		}
	}
}
