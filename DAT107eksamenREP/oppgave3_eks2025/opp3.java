
package oppgave3_eks2025;

import java.math.BigDecimal;

public class opp3 {
	@Entity
	public class Matrett{
		@Id GeneratedValue (strategy= GenerationType.IDENTETY)
		private int id;
		private String navn;
		private String kategori;
		private BigDecimal salgspris;
		
		
		
	
		
		
	}

}
