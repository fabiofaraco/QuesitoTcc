package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
	private static EntityManagerFactory entityManagerFactory = null;
	
	private PersistenceUtil() {}
	
	public static EntityManager getEntityManager() {
		
		if(entityManagerFactory == null || !entityManagerFactory.isOpen()) {
			entityManagerFactory = Persistence.createEntityManagerFactory("quesitoSocorro");
		}
		
		return entityManagerFactory.createEntityManager();
	}
	
//	--------------------------------------------------------------------------------------------------------
	
}
