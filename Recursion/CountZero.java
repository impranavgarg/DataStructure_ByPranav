package Recursion;

public class CountZero {

    public static void main(String[] args) {
        int x =1000;
        System.out.println(countZero(x));
        
    }


    private static int countZero(int x ){

        if(x==0){
            return 0;
        }
        if(x%10==0){
            return 1+ countZero(x/10);
        }else{
            return countZero(x/10);
        }




    }



    
}
