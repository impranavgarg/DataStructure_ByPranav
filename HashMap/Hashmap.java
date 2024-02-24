package HashMap;

import java.util.*;

public class Hashmap {

    public static void main(String[] args) {



       // Implementation of HashMap
       HashMap<String, Integer> map = new HashMap<>();

        map.put("pranav", 97);
        map.put("raghav", 07);
        map.put("rahul", 87);
        map.put("rohan", 97);

        System.out.println(map.containsKey("pranav"));
        System.out.println(map.get("pranav"));
        System.out.println(map.getOrDefault("pranavgarg", 89));


        // Implementation of HashSet
        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(23);
        hashset.add(34);
        hashset.add(45);
        hashset.add(56);
        hashset.add(23);
        hashset.add(56);

        System.err.println(hashset);

        // Implementation of TreeMap               
        TreeMap<String, Integer> treemap = new TreeMap<>();

        treemap.put("pranav", 97);
        treemap.put("raghav", 07);
        treemap.put("rahul", 87);
        treemap.put("rohan", 97);

        System.out.println(treemap.containsKey("pranav"));
        System.out.println(treemap.get("pranav"));
        System.out.println(treemap.getOrDefault("pranavgarg", 89));



    }
    
}
