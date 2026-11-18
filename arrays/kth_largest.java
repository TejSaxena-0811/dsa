// kth largest element in array:


// simple approach:  O(nlogn)
import java.util.Arrays;

public class kth_largest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);  // sorts in ascending order

        int n = arr.length;
        System.out.println(arr[n - k]);  // k-th largest is at index n-k
    }
}




// interviewer can ask to solve without using sorting, so do that using heap later.