package eksamen2024_januar;

import java.util.Collections;
import java.util.List;

import eksamen2024_januar.Oppgave1.Film;

public class Oppgave1b {
	
	public List<Film> hentFilmerRegissertAv(int personId) {
		
		EntityManeger em = emf.createEntityManeger();
		
		try {
			Person person = em.find(Person.class,personId);
			
			if(person == null) {
				return Collections.emptyList();
			}
			
			TypedQuery<Film> sporring ="SELECT f FROM  FILM f WHERE f.regissor.id := personId", Film.class);
			sporring.setParameter("personId", personId);
			
			return sporring.getResultList();
			
		}//siden det er en liste, kan vi filtrere svarerene ut med en spørring
		
		finally {
			em.close();
		}
	}
		
		public List<Film> hentFilmerISjanger(String sjanger){
			entityManager em = emf.entityManager();
			
			try {

				if(sjanger==null) {
					return Collections.emptyList();		
			}
				
				TypedQuery<Film> sporring = "SELECT f FROM FILM f WHERE f.sjanger = :sjanger",Film.class);
				sporring.setParameter("sjanger",sjanger);
				
				return sporring.getResultList();
				
		} finally {
			em.close();
			
		}
	
		
		
	}
	
	

}
