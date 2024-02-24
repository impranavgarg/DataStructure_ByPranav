package HashMapsProblems;

import java.util.HashSet;

public class HappyNumber {

    /*
     * downwards approch give wrong output beacuse if the no. is not a
     * happy number then loops for infinite time
     */
    /* ⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇ */
    /*
     * public static boolean isHappy(int n) {
     * while(n>1){
     * int x = powsum(n);
     * n =x;
     * 
     * 
     * }
     * if(n==1){
     * return true;
     * }
     * return false;
     * 
     * 
     * 
     * }
     * private static int powsum(int x ){
     * int sum =0;
     * while(x>0){
     * int r = x%10;
     * sum = (int) (sum + Math.pow(r,2));
     * x=x/10;
     * }
     * return sum;
     * }
     * 
     */

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && n != 4 && !set.contains(n)) {
            set.add(n);
            int x = powsum(n);
            n = x;

        }
        return n == 1;

    }

    private static int powsum(int x) {
        int sum = 0;
        while (x > 0) {
            int r = x % 10;
            sum += r * r;
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
}
