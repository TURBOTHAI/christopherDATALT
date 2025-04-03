package uke13.Oppgave1;

public class Oppgave1f {
	
	//skjømte ikkje helt oppgave f, tabellen blei generelt bedre når eg fikk utvidet den, og trengselen på å endre 
    private static String[] hashTable; //setter opp tabellen
    private final static int TABLE_SIZE = 20; // den skal være en fast lengde på 10
    
    public Oppgave1f() {
        hashTable = new String[TABLE_SIZE];
    }

    private int hash(String bilnummer) {
        return Math.abs(bilnummer.hashCode() % TABLE_SIZE);
    }
//    private int hash(String bilnummer ) {
//    	int sum =0;
//    	for(char c :bilnummer.toCharArray()) {
//    		sum+=(int) c;
//    		
//    	}
//    	return sum% 10000;
//    }
    
    
    public void leggtil(String bilnummer) {
        if(bilnummer != null) { 
            int index = hash(bilnummer);
            int originalIndex = index;
            
            do {
                if(hashTable[index] == null) {  
                    hashTable[index] = bilnummer;
                    return;
                }
                index = (index + 1) % TABLE_SIZE;
            } while(index != originalIndex);
            
            System.out.println("Kunne ikke sette inn " + bilnummer + " (tabellen er full)");
        }
    }
    
    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Indeks " + i + ": " + (hashTable[i] == null ? "Tom" : hashTable[i]+ "  "+ Math.abs(hashTable[i].hashCode())%10000));
        }
    }
    
    public static void main(String[] args) {
        Oppgave1f hashTable = new Oppgave1f();
        
        String[] bilnummer =  
            {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};    
        
        for (String i : bilnummer) {
            hashTable.leggtil(i);
        }
        
//        hashTable.leggtil(bilnummer[0]);
//        hashTable.leggtil(bilnummer[1]);
//        hashTable.leggtil(bilnummer[2]);
//        hashTable.leggtil(bilnummer[3]);
//        hashTable.leggtil(bilnummer[4]);
//        hashTable.leggtil(bilnummer[5]);
//        hashTable.leggtil(bilnummer[6]);
        
        
       
        
        hashTable.printTable();
    }
}