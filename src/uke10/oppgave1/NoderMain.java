package uke10.oppgave1;

public class NoderMain {
	
	public static void main(String[] args) {
		Node<String> a = new Node<>("A");
		Node<String> b = new Node<>("B");
		Node<String> c = new Node<>("C");
//		Oppgave a)
//		a.neste=b;
//		b.neste=c;
		
		
//		Oppgave b)
//		a.neste=c;
		
		
//		Oppgave c)
//		Node<String> d = new Node<>("D");
//		a.neste=d;
//		d.neste=c;
		
//		Oppgave d) 
		Node<String> d = new Node<>("D");
		Node<String> e = new Node<>("E");
		
		a.neste=d;
		d.neste=c;
		c.neste=e;
		
		skrivUtLenke("a-->", a);
		antallNoderILenke(a);
		lenkeInneholder(a,"C");
		
//		Oppgave a)-d) skrives direkte inn her ...
		
		
		
//		Kall til metodene i Oppgave e)-f) gjøres her ...
	}
	
	//Metodene i Oppgave e)-f) skrives inn her ...
	
	private static boolean lenkeInneholder(Node<String> start, String e) {
		
		boolean finnes=false;
		
		Node<String> p=start;
		
		while(p!=null) {
			if(p.data.equals(e)) {
				finnes=true;
				break;
				
				
			}
			
			
			p=p.neste;
			
		}
		System.out.print(finnes);
		return finnes;
		
	}
	
	//Oppgavef
	private static int antallNoderILenke(Node<String> start) {
		int antall=0;
		Node<String> p = start;
		while(p!=null) {
			antall++;
			p=p.neste;
		}
		
		System.out.println(antall);
		
		return antall;
	}
	
	private static<T> void skrivUtLenke(String intro, Node<T> start) {
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
