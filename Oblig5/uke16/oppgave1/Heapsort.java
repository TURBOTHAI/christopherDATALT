package uke16.oppgave1;

public class Heapsort {
	   private int[] heap;
	   private int size;
	   
	   public static void main(String[] args) {
		    // Testarray
		    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		    int k = 3;  // Antall minste elementer vi ønsker
		    
		    // Hent de k minste elementene
		    int[] kmin = innsettingKmin(array, k);
		    
		    // Skriv ut resultatet
		    System.out.println("De " + k + " minste elementene i arrayen er:");
		    for (int num : kmin) {
		        System.out.print(num + " ");
		    }
		}
	   
	   public static int[] innsettingKmin(int[] array, int k) {
		    if (k <= 0 || k > array.length) {
		        throw new IllegalArgumentException("k must be between 1 and array length");
		    }

		    // Bygg en min-heap av hele arrayen
		    buildMinHeap(array);

		    // Plukk ut de k minste elementene
		    int[] kmin = new int[k];
		    for (int i = 0; i < k; i++) {
		        kmin[i] = extractMin(array, array.length - i);
		    }

		    return kmin;
		}

		private static void buildMinHeap(int[] arr) {
		    for (int i = arr.length / 2 - 1; i >= 0; i--) {
		        minHeapify(arr, arr.length, i);
		    }
		}

		private static void minHeapify(int[] arr, int heapSize, int i) {
		    int smallest = i;
		    int left = 2 * i + 1;
		    int right = 2 * i + 2;

		    if (left < heapSize && arr[left] < arr[smallest]) {
		        smallest = left;
		    }
		    if (right < heapSize && arr[right] < arr[smallest]) {
		        smallest = right;
		    }

		    if (smallest != i) {
		        swap(arr, i, smallest);
		        minHeapify(arr, heapSize, smallest);
		    }
		}

		private static int extractMin(int[] arr, int heapSize) {
		    if (heapSize < 1) throw new IllegalStateException("Heap is empty");
		    int min = arr[0];             // Roten er minste element
		    arr[0] = arr[heapSize - 1];   // Sett siste element i roten
		    minHeapify(arr, heapSize - 1, 0); // Reparer heapen
		    return min;
		}

		private static void swap(int[] arr, int i, int j) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	   // Skriver ut heapen (for testing)
	   public void printHeap() {
	       for (int i = 1; i <= size; i++) {
	           System.out.print(heap[i] + " ");
	       }
	       System.out.println();
	   }
	   
	   
	   
}
	 


