package Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(31);
        heap.insert(78);
        heap.insert(87);
        heap.insert(2);
        heap.insert(3);
        heap.insert(80);
        heap.insert(11);
        heap.insert(87);

        ArrayList<Integer> list = heap.heapsort();
        System.out.println(list);
        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
    }
  
    
}
