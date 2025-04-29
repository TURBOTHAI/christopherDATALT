package eksamen2025;

public class opp3Ingrediens {
	
	//endret
	@Entity
	public class Ingrediens{		
		@Id 
		@GeneratedValue (strategy= GenerationType.IDENTETY)
		private int id;
		
		private String navn;
		private String allergen;
		
		@ManyToMany(mappedBy ="ingredienser")
		private List<Matrett> matretter;
		
		
		
		
	}
	
	

}
