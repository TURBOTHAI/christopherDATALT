package eksamen2025;

public class Opp3aIngrediensrep {
	
	@Entity
	public class Ingrediens{
		
		@Id @GeneratedValue = (strategy GenerationType.IDENTETY)
		private int id;
		
		private String navn;
		private String allergen;
		
		
		
	}

}
