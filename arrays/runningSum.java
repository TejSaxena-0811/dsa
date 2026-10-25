// leetcode 1480


import java.util.Arrays;
public class runningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        int[] sum = new int[n];

        for(int i = 0; i < n; i++){
            if(i == 0){
                sum[i] = arr[i];
            }
            else{
                sum[i] = sum[i-1] + arr[i];
            }
        }

        System.out.println(Arrays.toString(sum));
    }
}
