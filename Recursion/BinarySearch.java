package Recursion;

public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {1, 2, 4,67,89,90,345,786};
        System.out.println(binarySearch(arr, 0, arr.length-1, 89));
        
    }

    private static int binarySearch(int[] arr , int start, int end , int finder){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == finder){
            return mid;
        }
        else if(arr[mid]> finder){
            return binarySearch(arr, start, mid -1, finder);
        }else{
            return binarySearch(arr, mid + 1, end, finder);
        }
    }
    
}
