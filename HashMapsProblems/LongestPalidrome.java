package HashMapsProblems;

import java.util.HashMap;

/*
409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
public class LongestPalidrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int sum = 0;
        boolean oddFound = false;

        for (int count : map.values()) {
            sum += count / 2 * 2; 
            if (count % 2 == 1) {
                oddFound = true; 
            }
        }

        return sum + (oddFound ? 1 : 0); 
        
    }
}
