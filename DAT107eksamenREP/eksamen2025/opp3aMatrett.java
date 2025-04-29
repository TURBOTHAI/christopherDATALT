
package eksamen2025;

import java.math.BigDecimal;

public class opp3aMatrett {
	
	@Entity//Entity er det samme som en relasjon kan du si "tabell"
	
	public class Matrett{//må ha en klasse på selve relasjonen
		@Id GeneratedValue (strategy= GenerationType.IDENTETY)
		private int id;// her må id være under for at den skal bli godkjent som GeneratedValue
		
		private String navn;
		private String kategori;
		private BigDecimal salgspris;
		
		@ManyToMany(fetch = FetchType.EAGER)// denne henter data fra matrett-tabellen og data fra ingrediens-tabellen
		//det ManyToMany med fetch gjør er at den forklarer Hibernate at denne varibelen( som er en liste= representerer en mange-til-mange-relajson
		@JoinTable(
			name = "exam_har_ingrediens",
			joinColums = @JoinColumn(name="matrett_id"),
			inversJoinColumns= @JoinColumn(name="ingreduens_id"))
		private List<Ingrediens> ingredienser;
		
	}
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	
		
		
	}

}
