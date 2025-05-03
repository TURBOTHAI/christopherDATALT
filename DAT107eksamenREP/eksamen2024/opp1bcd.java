package eksamen2024;

import java.util.List;

import eksamen2024.opp1a.Medlem;

public class opp1bcd {
	
	public Medlem finnMedlemMedNr(int medlemnr) {
		
		EntityManeger em = emf.createEntityManeger();
		
		try {
			return em.find(Medlem.class,medlemnr);
		} finally {
			em.close();
			
		}
	}
	
	public List<Bok>finnBokerPaaForfatter(String forfatter){
		
		String sporring = "SELECT b FROM b.Bok WHERE b.forfatter:= forfatter";
		
		
		EntityManeger em = emf.createEntityManeger();
		
		try {
			TypedQuery<Bok> querry = em.createQuery(sporring,Bok.class);
			setParameter("forfatter",forfatter);
			return querry.getResultList();
			
		} finally {
			em.close();
			
		}
	}
	
	public boolean leverTilbakeBok(int bokid) {
		
		String sporring = """ 
				SELECT h FROM Utlaan h WHERE h.bokid=:bokid 
				AND h.returdato = null """ ;

				
		EntityManeger em = emf.createEntityManeger();		
		EntityTransaction tx = em.getTransaction();		
		
		try {
			TypedQuery<Utlaan> querry = em.creatQuerry(sporring, Utlaan.class);
			querry.setParameter("bokid", bokid);
			
			Utlaan utlaan = querry.getSingelResult();// henter en og baren en bok som er på utlaan
			utlaan.setReturdato(LocalDate.now());//setter return datoen fra null til datoen akkurat no
			tx.commit();
			
			return true;
			
			
		} catch (NoResultException | NonUniqueResultException e ){
			tx.rollback();//viss en prøver å levere en bok som ikkj eer registert i Utlaan, altså den er ikkje satt som utlaan
			//eller viss det er flere utlaan på samme bok
			return false;
			
			} finally {
				em.close();
		}
		
			
		}
		
	}
	


