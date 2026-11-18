// leetcode 258



//brute force:

// public class addDigits {
//     public static void main(String[] args) {
//         int n = 38;
//         while(n >= 10){
//             int sum = 0;
//             while(n > 0){
//                 sum = sum + (n%10);
//                 n = n / 10;
//             }
//             n = sum;
//         }
//         System.out.println(n);
//     }
// }





// optimized:
public class addDigits{
    public static void main(String[] args) {
        int n = 38;
        if(n == 0){
            System.out.println(0);
        }
        else if(n%9 == 0){
            System.out.println(9);
        }
        else{
            System.out.println(n%9);
        }
    }
}