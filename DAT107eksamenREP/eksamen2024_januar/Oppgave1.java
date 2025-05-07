package eksamen2024_januar;

import eksamen2024.List;
import eksamen2024.ManyToOne;
import eksamen2024.opp1a.Utlaan;

public class Oppgave1 {
	
	@Entity
	public class Film{
		@Id @GeneratedValue(strategy=GenerationType.IDENTETY)
		private int id;
		
		private String tittel;
		private String aar;
		private String sjanger;
		
		@ManyToOne(mapped="film", fetch =FetchType.EAGER)
		@JoinColumn(name="regissor_id", nullable= false)
		private Person regissor; // var bare en person per film
		
	}
	
	
	@Entity
	public class Person{
		@Id @GeneratedValue(strategy=GenerationType.IDENTETY)
		private int id;
		
		private String fornavn;
		private String etternavn;
		private String fodselsaar;
		private String nasjonalitet;
		
		@OneToMany(mapped="film", fetch =FetchType.EAGER)
		private List<Film> film; // dette er fordi det er mangen filmer
		// derfor vi har liste
	}

	
}
