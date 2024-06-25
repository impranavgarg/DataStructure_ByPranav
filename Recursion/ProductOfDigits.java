package Recursion;

/**
 * ProductOfDigits
 */
public class ProductOfDigits {

    public static void main(String[] args) {
        int x = 123;
        System.out.println(productOfDigits(x));
        
    }

    private static int productOfDigits(int x){
        if(x<1){
            return 1;
        }

        return (x%10) * productOfDigits(x/10);
    }



    
}