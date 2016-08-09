package dao;

import interfaces.ProtocoloHibernateDao;

import java.util.ArrayList;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import util.PersistenceUtil;
import bean.Evento;
import bean.Protocolo;
import bean.Requerente;

public class ProtocoloDao extends GenericDao<Protocolo> implements ProtocoloHibernateDao {

	public ProtocoloDao() {
		super(Protocolo.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Evento> buscarEventoData(Calendar dataEvento) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select e from Evento e where e.dataEvento = :dataEvento");
			query.setParameter("dataEvento", dataEvento);
			
			return (ArrayList<Evento>) query.getResultList();
		} finally {
			manager.close();
		}
	}

	@Override
	public Requerente buscarDadosRequerente(Long cpf) {
		EntityManager manager = PersistenceUtil.getEntityManager();
		try {
			Query query = manager.createQuery("select r from Requerente r where r.cpf = :cpf");
			query.setParameter("cpf", cpf);
			
			return (Requerente)query.getSingleResult();
		} catch(NoResultException e) {
			return null;
		} finally {
			manager.close();
		}
	}
	
	

}
