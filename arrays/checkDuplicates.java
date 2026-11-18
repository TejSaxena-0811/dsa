// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

public class checkDuplicates{
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        boolean isDuplicate = false;
        for(int i = 0; i < arr.length-1; i++){  // running till n-1 is smart.
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
        }
        System.out.println(isDuplicate);
    }
}





// or, sort the array and do this:


// import java.util.Arrays;

// public class checkDuplicates{
//     public static void main(String[] args){
//         int[] arr = {5,7,2,3,1,5,3,2};
//         Arrays.sort(arr);
//         boolean isDuplicate = false;
//         for(int i = 0; i < arr.length-1; i++){
//             if(arr[i] == arr[i+1]){
//                 isDuplicate = true;
//                 break;
//             }
//         }
//         System.out.println(isDuplicate);
//     }
// }