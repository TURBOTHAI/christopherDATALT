package uke13.eksempelOppg1;

import java.util.Hashtable;

public class Main {
	public static void main(String args[]) {
		Hashtable<Integer,String> table = new Hashtable<>(10);
		table.put(100,"svampebobo");
		table.put(123,"patrick");
		table.put(321,"Sandy");
		table.put(555,"Squidward");
		table.put(777, "Gary");
		
		for(Integer key :table.keySet()) { 
			System.out.println(key.hashCode() %10 + "\t"+key+ "\t"+ table.get(key));
			
			
		}
	}

}
