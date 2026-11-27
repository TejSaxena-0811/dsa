// lb = lower bound | ub = upper bound


package binarySearch;



// lower bound:  The lower bound of a value x in a sorted array is the first position (smallest index) where an element greater than or equal to x appears.

// upper bound:  The upper bound of a value x in a sorted array is the first position where an element strictly greater than x appears.

// so the basic difference is, lb = arr[i] >= x | ub = arr[i] > x





// lower bound

// public class Lb_Ub {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,3,5,8,8,10,10,11};
//         int x = 9;
//         int n = arr.length;

//         int left = 0;
//         int right = n-1;

//         int ans = n;  // initialized as n because if no lower bound exists, the correct answer would be n. Default insertion point (end of array)

//         while(left <= right){
//             int mid = left + (right - left)/2;
//             // maybe an answer
//             if(arr[mid] >= x){
//                 ans = mid;
//                 right = mid-1;  // look for smaller index on left
//             }
//             else{
//                 left = mid+1;  // look for smaller index on right
//             }
//         }
//         System.out.println(ans);
//     }
// }











// upper bound:

public class Lb_Ub{
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8,8,11,11,11,12};
        int x = 6;
        int n = arr.length;

        int left = 0;
        int right = n-1;

        int ans = n;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] > x){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(ans);
    }
}