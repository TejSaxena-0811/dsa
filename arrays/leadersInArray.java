// leaders in an array

// Given an integer array nums, return a list of all the leaders in the array. A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.



// brute force:

// import java.util.*;
// public class leadersInArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 5, 3, 1, 2};
//         // int[] arr = {-3, 4, 5, 1, -4, -5};
//         int n = arr.length;
        
//         int[] leaders = new int[n];
//         int k = 0;
        
//         for(int i = 0; i < n; i++){
//             int max = arr[i];
//             for(int j = i; j < n; j++){
//                 if(arr[j] > max){
//                     max = arr[j];
//                 }
//             }
//             if(max == arr[i]){
//                 leaders[k] = max;
//                 k++;
//             }
//             else{
//                 continue;
//             }
//         }
//         // System.out.println(Arrays.toString(leaders));
//         System.out.println(Arrays.toString(Arrays.copyOfRange(leaders, 0, k)));
//     }
// }







// optimized:  (make sure to tell the interviewer that we are using the O(n) space just to return the final answer, and not to solve).

import java.util.*;
public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 2};
        // int[] arr = {-3, 4, 5, 1, -4, -5};
        int n = arr.length;
        
        int[] leaders = new int[n];
        
        int k = 0;
        
        int maxSoFar = Integer.MIN_VALUE;
        
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > maxSoFar){
                leaders[k] = arr[i];
                k++;
                maxSoFar = arr[i];
            }
        }
        // System.out.println(Arrays.toString(leaders));
        System.out.println(Arrays.toString(Arrays.copyOfRange(leaders, 0, k)));
    }
}


// in the optimized one, if we are asked to return in the same order in which they appear, we can just reverse the new array
// if we are asked to return in sorted form, use Arrays.sort() function to sort in O(nlogn).