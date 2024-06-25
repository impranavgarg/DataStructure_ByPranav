package Recursion;

public class CheckSorted {
    

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,8,6,7};
        System.out.println(checkSorted(arr, 0));
        
    }

    private static boolean checkSorted(int[] arr, int index){
        if(arr.length-1 == index){
            return true;
        }
        return arr[index] <arr[index+1] && checkSorted(arr, index+1);

    }
}
