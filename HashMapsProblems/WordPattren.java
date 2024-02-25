package HashMapsProblems;

import java.util.HashMap;

/*
290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between 
a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 */
public class WordPattren {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i =0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }

            }else{
                if (map.containsValue(words[i])) { 
                    return false; 
                }
                map.put(pattern.charAt(i),words[i]);


            }

        }

        return true;
        
    }
    
}
