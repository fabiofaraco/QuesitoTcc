package dao;

import interfaces.Dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.PersistenceUtil;

public class GenericDao<T> implements Dao<T> {

	private Class<T> persistentClass; 
	
	public GenericDao(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	@Override
	public void incluir(T t) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.persist(t);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		
	}

	@Override
	public void alterar(T t) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.merge(t);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		
	}

	@Override
	public void remover(Serializable id) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		T t = manager.find(persistentClass, id);
		
		try {
			manager.getTransaction().begin();
			manager.remove(t);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getLista(String q) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			Query query = manager.createQuery(q);
			return query.getResultList();
		} finally {
			manager.close();
		}
	}

	@Override
	public T buscar(Serializable id) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			return manager.find(persistentClass, id);
		} finally {
			manager.close();
		}
	}

}
