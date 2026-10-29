// find the length of the longest subarray with sum as k.





// brute force: (tc: O(n^3) , sc: O(1))

// public class LongestSubarrayWithSumK{
//     public static void main(String[] args) {
//         int[] arr = {10 , 5 , 2 , 7 , 1, 9};
//         int target = 15;
//         int n = arr.length;

//         int len = 0;

//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 int sum = 0;
//                 for(int k = i; k <= j; k++){
//                     sum += arr[k];
//                 }
//                 if(sum == target){
//                     len = Math.max(len , j-i+1);
//                 }
//             }
//         }
//         System.out.println(len);
//     }
// }










// brute force: (tc: O(n^2) , sc: O(1))

// public class LongestSubarrayWithSumK{
//     public static void main(String[] args) {
//         int[] arr = {10 , 5 , 2 , 7 , 1, 9};
//         int target = 15;
//         int n = arr.length;

//         int len = 0;

//         for(int i = 0; i < n; i++){
//             int sum = 0;
//             for(int j = i; j < n; j++){
//                 sum += arr[j];

//                 if(sum == target){
//                     len = Math.max(len , j-i+1);
//                 }
//             }
//         }
//         System.out.println(len);
//     }
// }













// this is the "better" solution...it will work with negatives, positives, zeroes

// import java.util.*;
// public class LongestSubarrayWithSumK {
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 2, 7, 1, 9};
//         int k = 15;
//         int n = arr.length;
//         int[] prefixSum = new int[n];
        
//         prefixSum[0] = arr[0];
        
//         for(int i = 1; i < n; i++){
//             prefixSum[i] = prefixSum[i-1] + arr[i];
//         }
        
//         int maxL = 0;
        
//         HashMap<Integer,Integer> hash = new HashMap<>();
//         for(int j = 0; j < n; j++){
//             if(prefixSum[j] == k){
//                 maxL = Math.max(maxL , j+1);
//             }
            
//             int val = prefixSum[j] - k;
//             if(hash.containsKey(val)){
//                 int length = j - hash.get(val);
//                 maxL = Math.max(maxL , length);
//             }
            
//             if(!hash.containsKey(prefixSum[j])){
//                 hash.put(prefixSum[j] , j);
//             }
//         }
//         System.out.println(maxL);
//     }
// }







// optimized version of the above code...not using separate array for prefixSum, instead storing it in a variable...however, still O(n) sc because of hashmap...works with positives, negatives, zeroes.

import java.util.*;
public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        
        int n = arr.length;
        
        int sum = 0;
        
        int maxL = 0;
        
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for(int j = 0; j < n; j++){
            sum += arr[j];
            if(sum == k){
                maxL = Math.max(maxL , j+1);
            }
            
            int val = sum - k;
            if(hash.containsKey(val)){
                int length = j - hash.get(val);
                maxL = Math.max(maxL , length);
            }
            
            if(!hash.containsKey(sum)){
                hash.put(sum , j);
            }
        }
        System.out.println(maxL);
    }
}











// this is the optimized solution...does not work for negatives...also, eventhough there are 2 nested loops, tc is O(2n), that is, O(n), sc is O(1).
// it will fail even if there is one negative and rest are positive. this is because the sliding window assumes the sum only increases when you expand and only decreases when you shrink.

// public class LongestSubarrayWithSumK {
//     public static void main(String[] args) {
//         int[] arr = {10, 5, 2, 7, 1, 9};
//         int k = 15;
//         int n = arr.length;
        
//         int sum = 0;
//         int i = 0;
        
//         int maxL = 0;
        
//         for(int j = 0; j < n; j++){
//             sum += arr[j];
//             while(sum > k && i <= j){
//                 sum = sum - arr[i];
//                 i++;
//             }
//             if(sum == k){
//                 int length = (j-i)+1;
//                 maxL = Math.max(maxL , length);
//             }
//         }
//         System.out.println(maxL);
//     }
// }