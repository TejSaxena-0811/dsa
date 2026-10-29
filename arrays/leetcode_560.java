// find count of the number/count of subarrays who have sum as k





// brute force:
// public class leetcode_560{
//     public static void main(String[] args){
//         int[] arr = {9,4,20,3,10,5};
//         int k = 33;
//         int n = arr.length;

//         int count = 0;

//         for(int i = 0; i < n; i++){
//             int sum = 0;
//             for(int j = i; j < n; j++){
//                 sum += arr[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }









// optimized:
import java.util.*;
public class leetcode_560 {
    public static void main(String[] args) {
        int[] arr = {9,4,20,3,10,5};
        int k = 33;
        int n = arr.length;
        
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        
        int count = 0;
        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int j = 0; j < n; j++){
            if(prefixSum[j] == k){
                count++;
            }
            
            int val = prefixSum[j]-k;
            if(hash.containsKey(val)){
                count += hash.get(val);
            }
            
            if(hash.containsKey(prefixSum[j])){
                hash.put(prefixSum[j] , hash.get(prefixSum[j])+1);
            }
            else{
                hash.put(prefixSum[j] , 1);
            }
        }
        System.out.println(count);
    }
}










// without using prefixSum array, storing the running prefix sum in the sum variable.

// import java.util.*;
// public class leetcode_560 {
//     public static void main(String[] args) {
//         int[] arr = {9,4,20,3,10,5};
//         int k = 33;
//         int n = arr.length;
        
//         HashMap<Integer,Integer> hash = new HashMap<>();
        
//         int sum = 0;
//         int count = 0;
//         for(int j = 0; j < n; j++){
//             sum += arr[j];
//             if(sum == k){
//                 count++;
//             }
            
//             int val = sum-k;
//             if(hash.containsKey(val)){
//                 count+=hash.get(val);
//             }
            
//             if(hash.containsKey(sum)){
//                 hash.put(sum , hash.get(sum)+1);
//             }
//             else{
//                 hash.put(sum , 1);
//             }
//         }
//         System.out.println(count);
//     }
// }