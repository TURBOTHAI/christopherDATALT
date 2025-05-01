package eksamen2025;

public class Oppgave3dLagreIngrediens {

	public Ingrediens lagreIngrediens(String navn, String allergen) {
		EntityManager = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		if (finnesIngrediens(navn)){
			return null;
		}
		
		Ingrediens nyIngrediens;
		
		try {
			tx.begin()
			nyIngrediens=lagreIngredeins(navn, allergen);
			em.persist(nyIngrediens);//lagrer endringene
			tx.commit();//bekrefter endringen og at alt har gått fint
		} finally {
			em.close();
			
			
		}
		
		return nyIngrediens;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Ingrediens lagreIngredins(String navn, String allergen) {
//		
//		EntityManager = emf.createEntityManeger();//må alltid ha for å bruke meotdene
//		EntityTransaction tx = em.getTransaction();
//		
//		if(finnesIngrediens(navn)) {
//			return null;//da gjør vi ingen ting
//		}
//		
//		Ingrediens nyIngrediens;
//		
//		try {
//			tx.begin();// starter transakjsnonen 
//			
//			nyIngrediens = new Ingrediens(navn, allergen);
//			em.persist(nyIngrediens);//lagrer objektet i databasen
//			
//			tx.commit();//fullfører og bekreft endringen
//			
//			//viss noe går galt i for eksempel i persist delen så avbrytes hele og stopper denne prossesen
//		} finally {
//			em.close
//		}
//		return nyIngrediens;
//		
//		
//	}
	

}
