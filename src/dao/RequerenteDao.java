package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import bean.Requerente;
import conexao.PersistenceUtil;

public class RequerenteDao {

	@SuppressWarnings("unchecked")
	public List<Requerente> getListaRequerentes() {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			Query query = manager.createQuery("select r from Requerente r");
			return query.getResultList();
		} finally {
			manager.close();
		}
	}
	
//	------------------------------------------------------------------------------------------------------	
	
	public void incluir(Requerente requerente) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.persist(requerente);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
//	------------------------------------------------------------------------------------------------------
	
	public void alterar(Requerente requerente) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		
		try {
			manager.getTransaction().begin();
			manager.merge(requerente);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
//	------------------------------------------------------------------------------------------------------
	
	public void remover(int id) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		Requerente requerente = manager.find(Requerente.class, id);
		
		try {
			manager.getTransaction().begin();
			manager.remove(requerente);
			manager.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
//	------------------------------------------------------------------------------------------------------
	
	public Requerente buscar(int id) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try{
			return manager.find(Requerente.class, id);
		} finally {
			manager.close();
		}
	}
}
