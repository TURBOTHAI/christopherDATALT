package eksamen2025;

public class opp3aMatrettrep {
	
	
	
	@Entity
	public class Matrett{
		
		@Id	@GeneratedValue = (strategy GenerationTypeIDENTETY)
		private int id;
		private String navn;
		private String kategori;
		private BigDecimal slagspris; 
		
		
		
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(name="matrett_har_ingrediens", joinColumns = @JoinColumn(name="matrett_id"), inversJoinColumn = @JoinColumn(name="ingrediens_id"))
		private List<Ingrediens> ingredienser;
		
		
		
		
		
		
		
		
		
		
	
		@ManytoMany(fetch = FetchType.EAGER)
		@JoinTable(name="matrett_har-ingrediens", joinColumns = @JoinColumn(name="matrett_id"), inverseJoinColumn = @JoinColumn(name="ingrediens_"))
		private List<Ingrediens> ingredienser;
		
		
		@ManyToMany(fetch = FetchType.EAGER)
		1 @JoinTable(name = "examh24.matrett_har_ingrediens",
		joinColumns = @JoinColumn(name="matrett_id"),
		inverseJoinColumns = @JoinColumn(name="ingrediens_id"))
		2 private List<Ingrediens> ingredienser;
	}

}
