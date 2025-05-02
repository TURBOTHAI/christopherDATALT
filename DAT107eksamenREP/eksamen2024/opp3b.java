package eksamen2024;

import eksamen2024.opp3a.Medlem;

public class opp3b {
	
	public Medlem finnMedlemMedNr(int medlemnr) {
		
		EntityManeger em = emf.createEntityManeger();
		
		try {
			return em.find(Medlem.class,medlemnr);
		} finally {
			em.close();
			
		}
	}
	
	public List<Bok>finnBokerPaaForfatter(String forfatter){
		
		String sporring = "SELECT b FROM b.Bok WHERE b.forfatter:= forfatter"
		
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
		
		String sporring ="SELECT b FROM b.Bok "
		
		
	}
	

}
