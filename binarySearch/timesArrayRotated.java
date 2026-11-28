package binarySearch;

// number of times the array was rotated.

// the index at which the smallest element is, that much is the number of times the array was rotated! :)



// for unique elements:

// public class timesArrayRotated {
//     public static void main(String[] args) {
//         int[] arr = {4,5,6,7,0,1,2};
//         int n = arr.length;

//         int left = 0; int right = n-1;
//         int min = Integer.MAX_VALUE;
//         int idx = -1;

//         while(left <= right){
//             int mid = left + (right-left)/2;
//             if(arr[left] <= arr[mid]){
//                 if(arr[left] < min){
//                     idx = left;
//                     min = arr[left];
//                 }
//                 left = mid + 1;
//             }
//             else{
//                 if(arr[mid] < min){
//                     idx = mid;
//                     min = arr[mid];
//                 }
//                 right = mid - 1;
//             }
//         }
//         System.out.println(idx);  // this is the number of times the array was rotated.
//     }
// }














// for duplicate elements:

public class timesArrayRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,7,0,1,2};
        int n = arr.length;

        int left = 0; int right = n-1;
        int min = Integer.MAX_VALUE;
        int idx = -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left++; right--;
                continue;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] < min){
                    idx = left;
                    min = arr[left];
                }
                left = mid + 1;
            }
            else{
                if(arr[mid] < min){
                    idx = mid;
                    min = arr[mid];
                }
                right = mid - 1;
            }
        }
        System.out.println(idx);  // this is the number of times the array was rotated.
    }
}
