package uke10.oppgave2;

public class NoderMain {
	
	public static void main(String[] args) {
		// Tenker at vi skal opprette en lenke som pekes på av forste
		Node<Integer> forste = null;
		Node<Integer> ny = null;
		
		// Oppretter en ny node og setter denne inn først i lenken
		ny = new Node<>(4);
		ny.neste = forste;
		forste = ny;
		skrivUtLenke("forste--> ", forste); // forste--➤[4|-]
		
		// Oppretter en ny node og setter denne inn først i lenken
		ny = new Node<>(3);
		ny.neste = forste;
		forste = ny;
		skrivUtLenke("forste--> ", forste); // forste--➤[3|-]--➤[4|-]
		
		//Oppgave a) skrives direkte inn her ...
		ny= new Node<>(2);
		ny.neste=forste;
		forste=ny;
		
		ny=new Node<>(1);
		ny.neste=forste;
		forste=ny;
		
		
		skrivUtLenke("forste--> ", forste);
		lenkeInneholderRekursiv(forste, 2);
//		skrivUtFremlengsRekrusiv(forste);
		skrivUtBaklengsRekrusiv(forste);
		//Kall til metodene i Oppgave b)-g) gjøres her ...
		
	}
	
	/* ---------------------------------------------------------------- */
//	Metodene i Oppgave b)-g) skrives inn her ...
	
	
	private static void skrivUtFremlengsRekrusiv(Node<Integer> start) {
		
		
//		private static <T> void skrivUtLenke(String intro, Node<T> start) {
//			System.out.print(intro);
//			Node<T> p = start;
//			while (p != null) {
//			System.out.print("[" + p.data + "|-]");
//				if (p.neste != null) {
//					System.out.print("--➤");
//			}
//				p = p.neste;
//			}
//				System.out.println();
//			}
		
		
		if(start!=null) {
			System.out.println(start.data+" ");
		}
		
		start=start.neste;
		
		skrivUtFremlengsRekrusiv(start);
	}
	
	private static void skrivUtBaklengsRekrusiv(Node<Integer> start) {
		
		if(start==null) {
			return;
		}

		
		skrivUtBaklengsRekrusiv(start.neste);
		System.out.print(start.data);

	}
	
	private static boolean lenkeInneholderRekursiv(Node<Integer> start, int e) {
	
		if(start==null) {
			System.out.println(false);
			return false;
		}
		
		
		if(start.data==e) {//viss første stemmer
			System.out.println(true);
			return true;
		}
		
		
//		Node<Integer> p= start;
//		
//		boolean finnes =false;
//		
//		if(p==null){
//			System.out.println(finnes);
//			return finnes;
//			
//			
//		}
//		if(p.data==e) {
//			finnes=true;
//			System.out.println(finnes);
//		}
		
			
		
		return lenkeInneholderRekursiv(start.neste,e);
		
	}
	
	
	private static <T> void skrivUtLenke(String intro, Node<T> start) {
		System.out.print(intro);
		Node<T> p = start;
		while (p != null) {
		System.out.print("[" + p.data + "|-]");
			if (p.neste != null) {
				System.out.print("--➤");
		}
			p = p.neste;
		}
			System.out.println();
		}

}
