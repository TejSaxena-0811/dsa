// Count Inversions: Given an integer array nums. Return the number of inversions in the array. Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j. It indicates how close an array is to being sorted. A sorted array has an inversion count of 0. An array sorted in descending order has maximum inversion.

// the thing is that, it is an inversion if the left element is greater than the right element. simple.



// brute force:  tc: O(n^2) , sc: O(1)

// public class countInversions {
//     public static void main(String[] args) {
//         int[] arr = {5,3,2,4,1};
//         int n = arr.length;

//         int count = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j < n; j++){
//                 if(arr[i] > arr[j]){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }











// optimized (using merge sort):  tc: O(nlogn) , sc: O(n)

import java.util.*;
public class countInversions {
    public static int mergeSort(int[] arr , int si, int ei){
        int count = 0;
        if(si >= ei){
            return count;
        }
        int mid = si + (ei-si)/2;
        count += mergeSort(arr , si , mid);
        count += mergeSort(arr , mid+1 , ei);
        count += conquer(arr , si , mid , ei);
        
        return count;
    }
    public static int conquer(int[] arr,int si,int mid,int ei){
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        int i = si;
        int j = mid+1;
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{  // arr[i] > arr[j] , that is the condition for inversions.
                temp.add(arr[j]);
                count += (mid-i+1);
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
        
        int b = si;
        for(int a = 0; a < temp.size(); a++){
            arr[b] = temp.get(a);
            b++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,-2,8};
        int x = mergeSort(arr , 0 , arr.length-1);
        
        System.out.println(x);
    }
}
