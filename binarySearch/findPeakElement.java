package binarySearch;

// find the peak element in the array. a peak element is an element that is greater than it's neighbours.
// print the index.

// leetcode 162



// assume the array like this:   -infinity [1,2,3,4,5,6,7,8,5,1] -infinity




// brute force:  tc: O(n) , sc: O(1)

// public class findPeakElement{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,5,1};
//         int n = arr.length;
        
//         if(arr[0] > arr[1]){
//             System.out.println(arr[0]);
//             return;
//         }
//         if(arr[n-1] > arr[n-2]){
//             System.out.println(arr[n-1]);
//             return;
//         }

//         for(int i = 1; i < n-1; i++){
//             if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
//                 System.out.println(i);
//                 return;
//             }
//         }
//     }
// }


















// optimized:  tc: O(logn) , sc: O(1)

public class findPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        // int[] arr = {1,2,1,3,5,6,4};
        // int[] arr = {1,2,3,4,5};
        // int[] arr = {5,4,3,2,1};
        int n = arr.length;

        int peak = -1;

        if(n == 1){
            peak = 0;
            System.out.println(peak);
            return;
        }
        if(arr[0] > arr[1]){
            peak = 0;
            System.out.println(peak);
            return;
        }
        if(arr[n-1] > arr[n-2]){
            peak = n-1;
            System.out.println(peak);
            return;
        }

        int left = 1; int right = n-2;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                peak = mid;
                break;
            }
            else if(arr[mid] > arr[mid-1]){
                left = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]){
                right = mid - 1;
            }
            // taking care of the "valley" edge case:
            else{  // to take care of the case where array has multiple peaks. example: [1,5,1,2,1]. if this else statement wasnt here, an infinite loop would have started.
                left = mid + 1;  // could've also written right = mid - 1 in place of this too.
            }
        }
        System.out.println(peak);
    }
}
