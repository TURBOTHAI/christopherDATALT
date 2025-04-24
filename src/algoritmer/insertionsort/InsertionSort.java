package algoritmer.insertionsort;

public class InsertionSort {
	public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int k = 6;
        int[] kmin = innsettingKmin(arr,k);
        
        
        
        
        insertionSort(arr);
        insertionSort(kmin);

        System.out.print("Sortert liste: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        System.out.print("Sortert liste med k: ");
        for (int num : kmin) {
            System.out.print(num + " ");
        }
    }
	
	public static int[] innsettingKmin(int []arr, int k) {
		int[] kmin=new int[k];
		

		
 		for(int i=0;i<k;i++) {
 			kmin[i]=arr[i];
 		}
 		
 		insertionSort(kmin);
 	
 		 for (int i = k; i < arr.length; i++) {
             if (arr[i] < kmin[k - 1]) {
                 kmin[k - 1] = arr[i]; // bytt ut største
                 insertionSort(kmin); // sorter på nytt
             }
         }
			
 		return kmin;
		}

	
	



public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int temp = arr[i];
        int j = i - 1;
        
        
        //viss j er større en i da bytter vi, også må vi huske å flutte i til neste posisjon
        // Flytt større elementer én plass til høyre
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = temp;
    }
}
	
	
	
//	 public static void main(String[] args) {
//	        int[] arr = {5, 2, 9, 1, 5, 6};
//	        
//	        insertionSort(arr);
//
//	        System.out.print("Sortert liste: ");
//	        for (int num : arr) {
//	            System.out.print(num + " ");
//	        }
//	    }
//	
//	
//	
//    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//            int j = i - 1;
//            
//            
//            //viss j er større en i da bytter vi, også må vi huske å flutte i til neste posisjon
//            // Flytt større elementer én plass til høyre
//            while (j >= 0 && arr[j] > temp) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//
//            arr[j + 1] = temp;
//        }
//    }

   
}
