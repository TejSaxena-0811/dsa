// left rotate an array by k places.

// leetcode 189: right rotate



// brute force:

// import java.util.Arrays;

// public class leftRotateAnArrayByKplaces {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         int n = arr.length;
//         int k = 2;
        
//         k = k % n;
//         k = ((k % n) + n) % n;
        
//         if(k == n || k == 0){
//             System.out.println(Arrays.toString(arr));
//             return;
//         }
        
//         int[] temp = new int[n];
//         int a = 0;
//         while(a < k){
//             temp[a] = arr[a];
//             a++;
//         }
        
//         int i = 0;
//         for(i = 0; i < n-k; i++){
//             arr[i] = arr[i+k];
//         }
//         int b = 0;
//         while(i < n){
//             arr[i] = temp[b];
//             i++; b++;
//         }
        
//         System.out.println(Arrays.toString(arr));
//     }
// }








// optimized: (much better and easier)

import java.util.Arrays;

class Main {
    public static int[] reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;

        // k = k % n;  // this will handle if value of k > n.
        k = ((k % n) + n) % n;  // this will handle for both cases that if k > n and k < 0.

        if(n == k || k == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        reverse(arr , 0 , k-1);
        
        reverse(arr , k , n-1);
        
        reverse(arr , 0 , n-1);
        
        System.out.println(Arrays.toString(arr));
    }
}




// Left Rotation:
// - Move elements from the front to the back.
// - Each element shifts one index to the left.
// - The first element wraps around to the end.

// Steps for left rotation(important):
// - Reverse from index 0 to k - 1
// - Reverse from index k to n - 1
// - Reverse the entire array (0 to n - 1)




// Right Rotation:
// - Move elements from the back to the front.
// - Each element shifts one index to the right.
// - The last element wraps around to the beginning.

// Steps for right rotation (important):
// - Reverse the entire array (0 to n - 1)
// - Reverse from index 0 to k - 1
// - Reverse from index k to n - 1
