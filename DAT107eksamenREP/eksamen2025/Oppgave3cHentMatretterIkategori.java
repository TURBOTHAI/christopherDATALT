package eksamen2025;

import eksamen2025.opp3aMatrett.Matrett;

public class Oppgave3cHentMatretterIkategori {
	
	public List<Matrett> hentMatretterIKategori(String kategori){
		EntityManager em = emf.createEntityManger();
		
			return em.createQueary(
					"SELECT m FROM Matrett m WHERE m.kategori = :kategori", Matrett.class)
					
					
					)
		}
		
		
		
		
	}

}
