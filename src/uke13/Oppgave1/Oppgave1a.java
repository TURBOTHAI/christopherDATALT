package uke13.Oppgave1;

public class Oppgave1a {
    private static String[] Hashtable; //setter opp tabellen
    private final static int TABLE_SIZE = 10; // den skal være en fast lengde på 10
    
    public Oppgave1a() {
        Hashtable = new String[TABLE_SIZE];
    }

    private int hash(String bilnummer) {
        return Math.abs(bilnummer.hashCode() % TABLE_SIZE);
    }
    
    public void leggtil(String bilnummer) {
        if(bilnummer != null) { 
            int index = hash(bilnummer);
            int originalIndex = index;
            
            do {
                if(Hashtable[index] == null) {  
                    Hashtable[index] = bilnummer;
                    return;
                }
                index = (index + 1) % TABLE_SIZE;// viss den ikkje er ledig
            } while(index != originalIndex);// går i en sirkulær vei helt til vi kommer til orginalIndexen
            
            System.out.println("Kunne ikke sette inn " + bilnummer + " (tabellen er full)");
        }
    }
    
    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Indeks " + i + ": " + (Hashtable[i] == null ? "Tom" : Hashtable[i]));
        }
    }
    
    public static void main(String[] args) {
        Oppgave1a table = new Oppgave1a();
        
        String[] bilnummer =  
            {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};    
        
        for (String i : bilnummer) {
            table.leggtil(i);
        }
        
        table.printTable();
    }
    
    
}