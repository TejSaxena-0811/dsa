package hashing;

import java.util.*;
// import java.util.HashMap;


public class hashMap {
    public static void main(String[] args) {
        // country (key) , population (integer)
        HashMap<String , Integer> map = new HashMap<>();
        // key is of type String, value is of type Integer.
        
        // insertion
        map.put("India" , 120);
        map.put("USA" , 30);
        map.put("China" , 150);
        
        System.out.println(map); // prints in no specific order
        
        map.put("China" , 180);
        System.out.println(map); // updates the value.
        
        // searching
        if(map.containsKey("India")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("not present");
        }
        // to print value of the key:
        System.out.println(map.get("China")); // if does not exist, will print null.
        
        // traversing in the map:
        for(Map.Entry<String , Integer> e: map.entrySet()){
            System.out.println(e);  // e.getKey() , e.getValue()
        }
        
        
        // deletion
        map.remove("China");
        System.out.println(map);
    }
}





