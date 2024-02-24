package HashMapsProblems;

import java.util.HashSet;


/*
 Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.


Example 1:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false
 */

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
