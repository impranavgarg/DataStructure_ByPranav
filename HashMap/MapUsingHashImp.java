package HashMap;

public class MapUsingHashImp {
    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();

        map.put("raghav", "varma");
        map.put("rahul", "yadav");
        map.put("raghuvanshi", "garg");

        System.out.println(map.get("rahul"));
    }
    
}
