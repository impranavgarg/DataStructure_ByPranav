package Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int x = 1020;
        System.out.println(sumofDigits(x));
        
    }

    public static int sumofDigits(int number){
        if(number<1){
            return 0;
        }


        return (number %10) + sumofDigits(number/10);
    }

    
}
