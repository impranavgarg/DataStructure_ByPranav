package HashMapsProblems;

import java.util.HashSet;

/*
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, 
return an array of their intersection. 
Each element in the result must be unique and you may 
return the result in any order.


Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

  */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);

        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set1.add(nums2[i]);
            }

        }
        int[] arr = new int[set1.size()];
        int j = 0;
        for (int i : set1) {
            arr[j] = i;
            j++;

        }

        return arr;

    }

}
