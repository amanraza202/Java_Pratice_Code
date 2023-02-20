// import java.util.HashMap;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion operation
        map.put("India", 120);
        map.put("US", 30);
        map.put("China",150);
        // System.out.println(map);

        // search
        // if(map.containsKey("Indonesia")){
        //     System.out.println("Key is presnt in the map");
        // }
        // else{
        //     System.out.println("Not present");
        // }
        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

        // for loop in collection
           for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
           }

    }
}