package eksamen24V;

public class Oppgave6 {
	
	
	
	public static void main(String[]args) {
	
	}
	
	public static int antallNoderIterativ(Node forste) {
		int teller = 0;
		Node temp = forste;
		
		while(temp!=null) {
			teller++;
			temp=temp.neste;
			
		}
		
	return teller;
	}
	
	public static int antallNodeRekrusiv(Node forste) {
		Node temp = forste;
		
		
		if(temp==null) {
			return 0;
		}
		
		return 1+ antallNodeRekrusiv(temp.neste);
	}
	
	
//	public static void main(String[]args) {
//		Node a = new Node(1);
//		
//		Node b = new Node(2);
//		
//		Node c = new Node(3);
//		
//		a.neste = b;
//		
//		b.neste=c;
//		
//		System.out.println(antallNoderIterativ(a));// skriver ut 3, men ikkje alle selve nodene men bare 3
//		
//	}
//	
//	public static int antallNoderIterativ(Node forste) {
//		int teller=0;
//		Node temp=forste;
//				
//		while(temp!=null) {
//			teller++;
//			temp=temp.neste;
//			
//		}
//		
//		return teller;		
//	}
//	
//	public static int antallNoderRekrusiv(Node forste) {
//		
//		
//		if(forste==null) {
//			return 0;//ingen noder
//	} else {
//		return 1 + antallNoderRekrusiv(forste.neste);
//	}
//	
//	}

}
