// tc: O(nlogn) | sc: O(n)

// depth first technique is used in this merge sort.

// public class MergeSort {
//     public static void mergeSort(int[] arr , int si , int ei){
//         if(si >= ei){  // base case
//             return;
//         }

//         int mid = si + (ei-si)/2;  // could have used (ei+si)/2 as well, both are same, but it wont work if number of elements in array are very large.
//         mergeSort(arr, si, mid);  // left part
//         mergeSort(arr, mid+1, ei); // right part
//         conquer(arr , si , mid , ei);
//     }

//     // this function is used to merge/conquer the individual parts...to combine the individual parts into the final sorted array.
//     public static void conquer(int[] arr , int si , int mid , int ei){
//         int[] temp = new int[ei - si + 1];
//         int i = si; // iterator for left part.
//         int j = mid+1; // iterator for right part.
//         int k = 0; // iterator for temp array.

//         while(i <= mid && j <= ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++; k++;
//             }
//             else{
//                 temp[k] = arr[j];
//                 j++; k++;
//             }
//         }

//         // now, if any elements are left in any of the two arrays (left or right) :

//         // left part
//         while(i <= mid){
//             temp[k] = arr[i];
//             i++; k++;
//         }

//         // right part
//         while(j <= ei){
//             temp[k] = arr[j];
//             j++; k++;
//         }

//         // now copy temp to original array:
//         int b = si;
//         for(int a = 0; a < temp.length; a++){
//             arr[b] = temp[a];
//             b++;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {6,3,9,5,-2,8};
//         mergeSort(arr, 0, arr.length-1);

//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
















// using array list:

import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] arr , int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr , si , mid);
        mergeSort(arr , mid+1 , ei);
        conquer(arr , si , mid , ei);
    }
    public static void conquer(int[] arr , int si , int mid , int ei){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = si;
        int j = mid+1;
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
        while(j <= ei){
            temp.add(arr[j]);
            j++;
        }
        
        // now copy temp to original array:
        int b = si;
        for(int a = 0; a < temp.size(); a++){
            arr[b] = temp.get(a);
            b++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,-2,8};
        mergeSort(arr , 0 , arr.length-1);
        
        System.out.println(Arrays.toString(arr));
    }
}




















// main()
//   |
//   --> mergeSort(arr, 0, 5)
//          |
//          |--> mergeSort(arr, 0, 2)
//          |      |
//          |      |--> mergeSort(arr, 0, 1)
//          |      |      |
//          |      |      |--> mergeSort(arr, 0, 0)  // base case
//          |      |      |--> mergeSort(arr, 1, 1)  // base case
//          |      |      |--> conquer(arr, 0, 0, 1)
//          |      |
//          |      |--> mergeSort(arr, 2, 2)  // base case
//          |      |--> conquer(arr, 0, 1, 2)
//          |
//          |--> mergeSort(arr, 3, 5)
//                 |
//                 |--> mergeSort(arr, 3, 4)
//                 |      |
//                 |      |--> mergeSort(arr, 3, 3)  // base case
//                 |      |--> mergeSort(arr, 4, 4)  // base case
//                 |      |--> conquer(arr, 3, 3, 4)
//                 |
//                 |--> mergeSort(arr, 5, 5)  // base case
//                 |--> conquer(arr, 3, 4, 5)
         
//          --> conquer(arr, 0, 2, 5)
