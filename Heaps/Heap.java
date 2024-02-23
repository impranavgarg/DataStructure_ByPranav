package Heaps;

import java.util.*;



 public class Heap<T extends Comparable<T>> {


    private ArrayList<T> list;

    public Heap(){
        list =  new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);

    }

    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (index*2)+1;
    }
    private int right(int index){
        return (index*2)+2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        
        if(index ==0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);

        }
        

        return temp;

    }

    private void downheap(int i) {
        if(i==list.size()){
            return;
        }
        int min = i;
        int l = left(i);
        int r  = right(i);
        if(l < list.size() && list.get(min).compareTo(list.get(l))>0){
            min = l;

        }
        if(r < list.size() && list.get(min).compareTo(list.get(r))>0){
            min = r;

        }

        if(min != i){
            swap(min, i);
            downheap(min);

        }


    }


    // heap sort
    public ArrayList<T> heapsort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while (!list.isEmpty()) {
            data.add(this.remove());
            
        }


        return data;
        
    }



    
}
