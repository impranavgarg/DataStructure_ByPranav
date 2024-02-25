package HashMapsProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count +1);
        }
        List<Integer>list=new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        for(int i = 0;i<k;i++){
            arr[i]= list.get(i);
        }
        return arr;
    }

    
}
