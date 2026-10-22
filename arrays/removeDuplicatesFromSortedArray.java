// leetcode 26



// brute force:
// import java.util.*;
// public class removeDuplicatesFromSortedArray {
//     public static void main(String[] args) {
//         int[] arr = {1,1,2};
//         int n = arr.length;

//         HashSet<Integer> set = new HashSet<>();

//         for(int i = 0; i < n; i++){
//             set.add(arr[i]);
//         }

//         int index = 0;

//         for(int num: set){
//             arr[index] = num;
//             index++;
//         }

//         System.out.println(set);
//     }
// }











// optimized: (tc: O(n) , sc: O(1))
import java.util.*;
public class removeDuplicatesFromSortedArray{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;

        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
            else{
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }
}