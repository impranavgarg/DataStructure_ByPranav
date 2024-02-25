package HashMapsProblems;

import java.util.HashMap;

/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false 
*/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i)) +1);
            }
            else{
                map.put(s.charAt(i),1);


            }
        }
        for(int i =0;i<s.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==0){
                    return false;
                }
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            else{
                return false;


            }
        }
        return true;
        
    }
    
}
