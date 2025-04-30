package eksamen2025;

import eksamen2025.opp3aMatrett.Matrett;

public class Opp3bhentAllergenerIMatrett {
	
	public List<String> hentAllergenerImatrett(int matrettId) {
		
		EntityManager em = emf.createEntityManager(); //lager en ny EntityManager som brukes til åp  kommunisere med databasen
		//emf står for EntityManagerFactory, vanligvis opprettet en gang per applikasjon
		// EntityManager er egt bare en pre ferdig klasse som tillater oss å manupule data i databasen via JPA
		
		try {
			Matrett matrett = em.find(Matrett, matrettId);//henter matretten fra databasen med den gitte ID-en
			//em.find() bruker klassen Matrett og en primernøkkel (her: matrettId) for å finne og returnere objektet fra data basen
		
			List<Ingrediens> ingredienser = matrett.getIngredienser();//henter ut lisen av ingredienser som tilhører matretten
			//forutsetter at Matrett-klassen har en metode getIngredienser() som returnerer en List<Ingrediens>
			
			
			
			List<String> allergener = allergener(ingredienser);
			
			return allergener;
			
		} finally {
			em.close;
		}
		
		/*det som skjer:
		 *først starter vi EntityManageren våres og lager en variabel som heter em sånn som det er lettere å bruke metodene inni EntityManager 
		 *bruker try for å faktisk køyre spørringene
		 *bruker Matrett klassen til å lage en variabel som bruker em.find metoden til å finne iden på selve retten
		 *deretter må vi finne en metode som bruker matrettId og lister ut ingrediensene til den. Vi har en tilgjengelig hjelpe metode som heter 
		 *List<Ingrediens> kor vi bruker en variabel også bruker vi variabelen til Matrett klassen og bruker den hjelpe metoden, vi kalte den for get.Ingredienser()
		 *no har det kommet en liste av ingrediensen til matretten sin Id. Og no skal vi bruke den andre hjelpe metoden den kalles List<String> allergener = allergener(ingredisner);
		 *
		*/
		
		
		
	}

}
