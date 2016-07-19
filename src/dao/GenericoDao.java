package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.PersistenceUtil;

public abstract class GenericoDao {
	
	public void incluir(Object objeto) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.persist(objeto);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
//	--------------------------------------------------------------------------------------------------------------	
	
	public void alterar(Object objeto) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.merge(objeto);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
//	--------------------------------------------------------------------------------------------------------------
	
	public void remover(int id, Class<?> classe) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		Object objeto = manager.find(classe, id);
		
		try {
			manager.getTransaction().begin();
			manager.remove(objeto);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
//	--------------------------------------------------------------------------------------------------------------
	
	@SuppressWarnings("unchecked")
	public List<Object> getLista(String hql) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			Query query = manager.createQuery(hql);
			return query.getResultList();
		} finally {
			manager.close();
		}
	}

//	--------------------------------------------------------------------------------------------------------------
	
	public Object buscar(int id, Class<?> classe) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			return manager.find(classe, id);
		} finally {
			manager.close();
		}
	}
}
