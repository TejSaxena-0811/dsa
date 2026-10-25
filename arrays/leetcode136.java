// find the number that appears once in the array, rest of the numbers appear twice.

public class leetcode136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int n = arr.length;

        int res = 0;

        for(int i = 0; i < n; i++){
            res ^= arr[i];
        }

        System.out.println(res);
    }
}
