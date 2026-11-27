package hashing;


import java.util.HashSet;
import java.util.Iterator;  // both hashmaps and hashsets are iterated using this iterator

// hashset does insertion, searching and deletion in O(1) tc.

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // set = name of hashset | Integer is the type of data that the hashset will store.
        
        // insert ... here, it will only store 1,2,3, because hashSET only stores unique values. 1 will not be stored another again.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        // search
        if(set.contains(1)){
            System.out.println("contains 1");
        }
        if(!set.contains(7)){
            System.out.println("does not contain 7");
        }
        
        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("you deleted 1 bru");
        }
        
        // size
        System.out.println("size of set is: " + set.size());
        
        // print all elements of set
        System.out.println(set);
        
        // iterator in hashset (import java.util.Iterator)
        Iterator<Integer> it = set.iterator();
        
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}