package uke15.oppgave2;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		KjedetBS_Tre<Integer> t = new KjedetBS_Tre<>();
		
		// Legg til 7, 5, 9, 3, 0, 8. NB! fungerer ikkje før vi har laga leggTil-metoden
		
		t.leggTil(30);
		t.leggTil(25);
		t.leggTil(40);
		t.leggTil(15);
		t.leggTil(27);
		t.leggTil(35);
		t.leggTil(45);
		t.leggTil(5);
		t.leggTil(17);
		t.leggTil(32);
		t.leggTil(23);
		t.leggTil(19);
		/* Treet skal no sjå slik ut
		 * 
		 *           7
		 *          /  \
		 *         5    9
		 *        /    /
		 *       3    8
		 *      /
		 *     0
		 */
		
		// Dersom leggTil-metoden er laga korrekt skal elementa kome ut sortert
		// sidan vi brukar Inorden-iteratoren
//		System.out.print("Innhold i treet (sortert): ");
//		for (Integer e : t) {
//			System.out.print(e + " " );
//		}
//		System.out.println();
//		
//
//		System.out.println("inneholder(3) skal gi true, svar: " + t.inneholder(3));
//		System.out.println("inneholder(10) skal gi false, svar: " + t.inneholder(10));
		t.skrivVerdier(10,25);
		
		
		
		
	}
}
