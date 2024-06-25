package Recursion;

public class Fibonacci {

    private static int fib(int n){

        // base condition
        if (n<=1) {
            return n;
        }
        
        

        return fib(n-1) + fib(n-2);
    }
    

    public static void main(String[] args) {
        int x = 6;
        System.out.println(fib(x));
    }
}
