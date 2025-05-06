package eksamen24V;

public class Oppgave7 {
	
	public static String desimalTilBinaer(int tallet) {
		
		if(tallet==0) {
			return("0");
			
		} else {
			String svar ="";
			Stabel s = new Stabel();
			
			while (tallet>0) {
				s.push(tallet % 2);
				tallet = tallet /2;
				
			}
			while(!s.empty()) {
				svar += s.pop();
				
			}
			return svar;
			
		}
	}

}
