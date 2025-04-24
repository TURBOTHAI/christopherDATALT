//public class jalla {
//    private int[] heap;
//    private int size;
//
//    public jalla(int[] array) {
//        this.heap = new int[array.length + 1];  // Plass til 1-basert indeks
//        this.size = array.length;
//        
//        // Kopier array inn i heap (start på indeks 1)
//        System.arraycopy(array, 0, heap, 1, size);
//        
//        buildMinHeap();
//    }
//
//    // Bygger minimumshaug fra bunnen av
//    private void buildMinHeap() {
//        for (int i = size / 2; i >= 1; i--) {  // Starter fra siste interne node
//            reparerNed(i);
//        }
//    }
//
//    // Reparerer ned en node (heapify)
//    private void reparerNed(int i) {
//        int min = i;
//        int venstre = 2 * i;
//        int hoyre = 2 * i + 1;
//
//        // Sjekk venstre barn
//        if (venstre <= size && heap[venstre] < heap[min]) {
//            min = venstre;
//        }
//
//        // Sjekk høyre barn
//        if (hoyre <= size && heap[hoyre] < heap[min]) {
//            min = hoyre;
//        }
//
//        // Bytt og fortsett rekursivt hvis nødvendig
//        if (min != i) {
//            swap(i, min);
//            reparerNed(min);
//        }
//    }
//
//    // Bytter to elementer i heapen
//    private void swap(int i, int j) {
//        int temp = heap[i];
//        heap[i] = heap[j];
//        heap[j] = temp;
//    }
//
//    // Skriver ut heapen (for testing)
//    public void printHeap() {
//        for (int i = 1; i <= size; i++) {
//            System.out.print(heap[i] + " ");
//        }
//        System.out.println();
//    }
//
//    // Eksempel på bruk
//    public static void main(String[] args) {
//        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        jalla minHeap = new jalla(array);
//        System.out.println("Minimumshaug (1-basert indeksering):");
//        minHeap.printHeap();
//    }
//}
package uke15.oppgave5;

