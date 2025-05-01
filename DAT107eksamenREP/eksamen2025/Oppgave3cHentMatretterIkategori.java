package eksamen2025;

import eksamen2025.opp3aMatrett.Matrett;

public class Oppgave3cHentMatretterIkategori {
	
	public List<String> hentMatretterIakategori(String kategori){
		
		EntityManager em = emf.createEntityManager();
		
		Stirng sporring = "SELECT m FROM Matrett m WHERE m.kategori=:kategori"; // filtrer matretten kategori i databasen
		
		TypedQuery<Matrett> q = em.createQuery(sporring,Matrett.class);//lager denne spørringen i variabelen sporring
		
		q.setParameter("kategori",kategori);
		
		return q.getResultList();
		
	} finally {
		em.close();
		
	}

}
