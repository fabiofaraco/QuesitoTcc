package conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager entityManager = null; 
	
	private HibernateUtil() {}
	
	private static EntityManagerFactory getEntityManagerFactory() {
		
		if(entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("quesitoSocorro");
		}
		
		return entityManagerFactory;
	}
	
//	--------------------------------------------------------------------------------------------------------
	
	public static EntityManager getEntityManager() {
		
		if(entityManager == null) {
			entityManager = getEntityManagerFactory().createEntityManager();
		}
		
		return entityManager;
	}
	
}
