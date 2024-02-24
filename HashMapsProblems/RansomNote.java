package HashMapsProblems;

import java.util.HashMap;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            int count = map.getOrDefault(magazine.charAt(i), 0);
            map.put(magazine.charAt(i),count +1);
        }
        for(int i = 0;i<ransomNote.length();i++){
            int x = map.getOrDefault(ransomNote.charAt(i), 0);
            if(x>=1){
                int count = map.get(ransomNote.charAt(i));
                map.put(ransomNote.charAt(i),count -1);
            }else{
                return false;
            }
        }

        return true;
    }
    
}
