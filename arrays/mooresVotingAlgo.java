// leetcode 169




// brute force:
// import java.util.*;
// public class mooresVotingAlgo {
//     public static void main(String[] args) {
//         int[] arr = {2,2,1,1,1,2,2};
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             int count = 0;

//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == arr[i]) {
//                     count++;
//                 }
//             }

//             if (count > n / 2) {
//                 System.out.println(arr[i]);
//                 return;
//             }
//         }

//         System.out.println("NO");
//     }
// }








// better:
// import java.util.*;

// public class mooresVotingAlgo{
//     public static void main(String[] args){
//         int[] arr = {2,2,1,1,1,2,2};
//         int n = arr.length;
        
//         HashMap<Integer,Integer> hash = new HashMap<>();

//         for(int i = 0; i < n; i++){
//             if(hash.containsKey(arr[i])){
//                 hash.put(arr[i] , hash.get(arr[i]) + 1);
//             }
//             else{
//                 hash.put(arr[i] , 1);
//             }
//         }

//         for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
//             if(entry.getValue() > n/2){
//                 System.out.println(entry.getKey());
//             }
//         }
//     }
// }









// optimized:

// find the majority element in the array. majority element is the element that appears more than n/2 times, and there would be only 1 such element or none.
// done in 2 steps: 1) select the candidate. 2) verify if the candidate is actually the majority element.
public class mooresVotingAlgo {
    public static void main(String[] args) {
        int[] arr = {7,0,0,1,7,7,2,7,7};
        int n = arr.length;
        
        int el = 0;  // element
        int count = 0;
        
        // candidate selection
        for(int i = 0; i < n; i++){
            if(count == 0){
                el = arr[i];
                count = 1;
            }
            else if(arr[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        
        // verification
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == el){
                count++;
            }
        }
        
        if(count > n/2){
            System.out.println(el + " is the majority element!");
        }
        else{
            System.out.println("No majority element");
        }
    }
}