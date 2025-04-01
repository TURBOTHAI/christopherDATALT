package uke13.Oppgave1;

public class BilskiltHashTable {
	private static String[] table; //setter opp tabellen
	private final static int TABLE_SIZE = 10; // den skal være en fast lengde på 10
	
	
	 public BilskiltHashTable() {
	        table = new String[TABLE_SIZE];
	    }

	
	private int hash(String bilnummer) {
		return Math.abs(bilnummer.hashCode()%TABLE_SIZE);//bilnummer stringen til hasCode og moduluserer tabell størrelsen	
	}
	
	//setter inn kor det er ledig plass i tabellen
	public void leggtil(String bilnummer) {
		if(bilnummer==null) {
			int index=hash(bilnummer);//her finner vi det primiteive int nummeret vet hjelp av metoden hash
			int orginalIndex=index;
		
			
		do {
			if(bilnummer==null) {//viss plassen er ledig
				table[index]=bilnummer;//setter inn verdien til indeksen 
				return;
		}
			index=(index+1)% TABLE_SIZE;// her så restarter vi fra null igjen
			
		}	while(index!=orginalIndex);
			System.out.println("Kunne ikke sette inn"+ bilnummer + "(tabellen er full");
		}
	}
	
	 public void printTable() {
	        for (int i = 0; i < TABLE_SIZE; i++) {
	            System.out.println("Indeks " + i + ": " + (table[i] == null ? "Tom" : table[i]));
	        }
	    }
	
	public static void main(String[] args) {
        BilskiltHashTable hashTable = new BilskiltHashTable();
        
		String [] bilnummer =  
			{"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944" };	
	
	
	for (String i : bilnummer) {
		hashTable.leggtil(i);
		
        
    }
	

    hashTable.printTable();
}
}
