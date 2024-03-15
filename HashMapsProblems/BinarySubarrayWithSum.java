package HashMapsProblems;

import java.util.HashMap;
import java.util.Map;

/*
930. Binary Subarrays With Sum

Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.

Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

Example 2:
Input: nums = [0,0,0,0,0], goal = 0
Output: 15
 */
public class BinarySubarrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int result = 0;
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            result += map.getOrDefault(prefixSum - goal, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum,0) + 1);
        }
        return result;
    }

    // alletrnate method without using hashmap 
    /*
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int sum = 0;
        int prefixSum[] = new int[nums.length + 1];
        prefixSum[0] = 1;
        
        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }
            prefixSum[sum]++;
        }
        
        return totalCount;
    }


    */
    
}
