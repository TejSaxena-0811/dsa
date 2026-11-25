package binarySearch;




// Math.sqrt(36)  // built in function






// brute force:  tc: O(n) , sc: O(1)

// public class squareRoot{
//     public static void main(String[] args) {
//         int num = 36;
//         int ans = -1;
//         for(int i = 1; i <= num; i++){
//             if(i * i <= num){  // floor
//                 ans = i;
//             }
//             else{
//                 break;
//             }
//         }
//         System.out.println(ans);
//     }
// }














// optimized:  tc: O(logn) , sc: O(1)

public class squareRoot {
    public static void main(String[] args) {
        int num = 28;
        int left = 1; int right = num;
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(mid * mid <= num){  // floor
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
