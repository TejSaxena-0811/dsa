// leetcode 1

// "better" solution:

import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int n = arr.length;
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++){
            int val = target - arr[i];
            if(hash.containsKey(val)){
                System.out.println(hash.get(val) + " and " + i);
                return;
            }
            else{
                hash.put(arr[i] , i);
            }
        }
        System.out.println("does not exist");
    }
}








// only good when array is sorted...similar time complexity to hashmap one. use this when interviewer asks you to solve without using hashmap.

// public class twoSum {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};  // Sorted array
//         int target = 10;

//         // Two-pointer logic directly in the main function
//         int left = 0;
//         int right = arr.length - 1;
//         boolean found = false;

//         while (left < right) {
//             int sum = arr[left] + arr[right];

//             if (sum == target) {
//                 System.out.println("Pair found at indices: [" + left + ", " + right + "]");
//                 found = true;
//                 break;  // Exit the loop once the pair is found
//             } else if (sum < target) {
//                 left++;  // Move left pointer to the right to increase the sum
//             } else {
//                 right--; // Move right pointer to the left to decrease the sum
//             }
//         }

//         if (!found) {
//             System.out.println("No pair found.");
//         }
//     }
// }
