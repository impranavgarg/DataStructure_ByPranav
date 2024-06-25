package Recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        reverseNumber(1234);
        System.out.println(sum);
        
    }


    
    static int sum =0;
    private static void reverseNumber(int x ){
        
        if(x==0){
            return;

        }
        int rem = x%10;
        sum = sum * 10 + rem;
        reverseNumber(x/10);
        
        
    }
}
