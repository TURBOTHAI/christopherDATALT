package eksamen2024;

public class opp1a {
	
	
	@Entity
	public class Bok {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String tittel;
		private String forfatter;
		private String hylle;
		
		
		
		
	}
	
	@Entity
	public class Medlem {
		@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
		private int nr;
		private String fornavn;
		private String etternavn;
		private String telefon;
		
		@ManyToOne (mappedby="Medlem", fetch = FetchType.EAGER)
		private List<Utlaan> utlaan;
		
	}
	
	@Entity
	public class Utlaan{
		@Id @GeneratedValue(stategy = GenerationType.IDENTITY)
		private int id;
		
		@ManyToOne @JoinColumn(name="bokid")
		private Bok bokid
		
		@ManyToOne @JoinColumn(name="medlemnr")
		private Medlem medlemnr;
		
		private String utlaandato;
		private String forfalldato;
		private String returdato;
		
		
	}

}
