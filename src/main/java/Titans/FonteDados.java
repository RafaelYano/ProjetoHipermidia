package Titans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FonteDados {
	
		private static EntityManagerFactory emf =
		Persistence.
		createEntityManagerFactory("titansPU");

		public static EntityManager createManager() {
			return emf.createEntityManager();
		}		
}
