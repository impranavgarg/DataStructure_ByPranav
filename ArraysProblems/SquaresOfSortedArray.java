package ArraysProblems;

/*
977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121] 

*/
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0;
        int r  = nums.length-1;

        for(int i = nums.length-1;i>=0;i--){
            int s = nums[l]*nums[l];
            int e = nums[r]*nums[r];
            if(s>=e){
                ans[i]= s;
                l++;

            }else{
                ans[i]=e;
                r--;
            }
        }
        return ans;
        
    }
    
    
}
