// move zeroes to the end of the array


// leetcode 283


// tc: O(n) , sc: O(1)
import java.util.*;
public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,4,0,5,2};
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
