package uke13.Oppgave1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Oppgave1b {
	
	
	//laget en liste
	private final static int TABLE_SIZE=10;
	private static LinkedList<String>[] table;
	
	//iterator
	
	  @SuppressWarnings("unchecked")
	    public Oppgave1b() {
	        table = new LinkedList[TABLE_SIZE];
	        for (int i = 0; i < TABLE_SIZE; i++) {
	            table[i] = new LinkedList<>();
	        }
	    }
	
	private int hashFunc(String bilnummer) {
		char sisteChar=bilnummer.charAt(bilnummer.length()-1);
		return Character.getNumericValue(sisteChar) % TABLE_SIZE;
		
		
	}
	
	public void leggTil(String bilnummer) {
		int pos= hashFunc(bilnummer);
		table[pos].add(bilnummer);//add metoden her lagrer dataen til bilnummerene som har samme pos og fly
		
	}
	
	public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Indeks " + i + ": ");
            if (table[i].isEmpty()) {
                System.out.println("Tom");
            } else {
                System.out.println(String.join(" -> ", table[i]));
            }
        }
    }
	
	
	
	
	public static void main(String[]args) {
		 Oppgave1b hashTable = new Oppgave1b();
		 
		 
		 String[] bilnummerer = {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};
		 
		 for( String bilnummer : bilnummerer) {
			 hashTable.leggTil(bilnummer);
			 
		 }
		 
		 hashTable.printTable();
		 
	}
	
	
	
		
	
	
	
	

}
