package HashMapsProblems;

import java.util.HashMap;

/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

 */
public class IsoMorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Integer> mapofs = new HashMap<>();
        HashMap<Character, Integer> mapoft = new HashMap<>();

        for(int i =0;i<s.length();i++){
            int x = mapofs.getOrDefault(s.charAt(i), 0);
            int y = mapoft.getOrDefault(t.charAt(i), 0);
            if (x == 0) {
                mapofs.put(s.charAt(i), i + 1);
            }
            if (y == 0) {
                mapoft.put(t.charAt(i), i + 1);
            }
            if(mapofs.get(s.charAt(i)) != mapoft.get(t.charAt(i))){
                return false;
            }
        }

        return true;

        
    }
    
}
