// leetcode 75





// brute force:
// Arrays.sort(arr);









// better: (tc: O(n) , sc: O(1))

// import java.util.*;
// public class DutchNationalFlagAlgo {
//     public static void main(String[] args) {
//         int[] arr = {0, 2, 1, 2, 0, 1};

//         // Count 0s, 1s, and 2s
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//         for (int num : arr) {
//             if (num == 0) cnt0++;
//             else if (num == 1) cnt1++;
//             else cnt2++;
//         }

//         int index = 0;

//         for (int i = 0; i < cnt0; i++) {
//             arr[index] = 0;
//             index++;
//         }

//         for (int i = 0; i < cnt1; i++) {
//             arr[index] = 1;
//             index++;
//         }

//         for (int i = 0; i < cnt2; i++) {
//             arr[index] = 2;
//             index++;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }












// optimized: (dutch national flag algo)
// tc: O(n) , sc: O(1)

import java.util.*;
class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0};
        int n = arr.length;
        
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
                // mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}