package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,87};
        System.out.println(linearSearch(arr, 49, 0));
        
    }

    private static int linearSearch(int[] arr, int find, int index){
        if (index ==arr.length -1) {
            return -1;
            
        }
        if(arr[index] == find){
            return index;
        }


        return linearSearch(arr, find, index+1);





    }
    
}
