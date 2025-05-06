package eksamen24V;

public class Oppgave8 {
	
	public static <T extends Comparable<T>> int binærsøk(int v, int h,T[] tabell, T verdi) {
		if(v>h) {
			return -1;
		}
		
		int m=(v+h)/2;
		
		int sammenligning=verdi.compareTo(tabell[m]);
		
		if(sammenligning==0) {
			return m;
		}
		
		if(sammenligning<0) {
			binærsøk(v,m-1,tabell,verdi);
		} else {
			binærsøk(m+1,h,tabell,verdi);
		}
		return 0;
		
	}
	
	

}
