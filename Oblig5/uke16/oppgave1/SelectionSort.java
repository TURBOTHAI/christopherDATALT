package uke16.oppgave1;

public class SelectionSort {
	
	
	
	public static void main(String[]args) {
		int[] array= {8,2,5,3,9,4,7,6,5};
		int k = 3;
		int[] kmin = innsettingKmin(array,k);
		
		 
		selectionSort(array);
		selectionSort(kmin);

        System.out.print("Sortert liste: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        System.out.print("Sortert liste med k: ");
        for (int num : kmin) {
            System.out.print(num + " ");
        }
    }
		
	
	public static int[] innsettingKmin(int []array,int k) {
		int[] kmin=new int[k];
		
		
		for(int i=0;i<k;i++) {
			kmin[i]=array[i];
		
	 }
		
		selectionSort(kmin);
		
		
		for(int i= k;i<array.length;i++) {
			if(array[i]<kmin[k-1]) {
				kmin[k-1]=array[i];
				selectionSort(kmin);
				
			}
		}
		return kmin;
		
	}
	
	
	private static void selectionSort(int[] array) {
		for( int i=0;i<array.length-1;i++) {
			int min=i;
			for (int j=i+1;j<array.length;j++) {
			if(array[min]>array[j]) {
				min=j;
			}
		 }

		int temp=array[i];
		array[i]=array[min];
		array[min]=temp;
		
	}
	
	}
}