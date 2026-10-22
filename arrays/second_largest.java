// 2nd largest element in an array

// optimized: O(n)
public class second_largest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5,6};
        int n = arr.length;
        int max = arr[0];
        int second_max = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        System.out.println("2nd largest: " + second_max);
    }
}







// brute force: [O(2n)]

// public class second_largest{
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,7,7,5,6};
//         int n = arr.length;
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < n; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         int second_max = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++){
//             if(second_max < arr[i] && arr[i] < max){
//                 second_max = arr[i];
//             }
//         }

//         System.out.println("2nd largest: " + second_max);
//     }
// }