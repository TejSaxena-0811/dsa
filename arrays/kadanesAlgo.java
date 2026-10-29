// classic and simple: (does not handle negative values | does not print the subarray)

// public class kadanesAlgo {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, -2, 7, -4};
//         int n = arr.length;
        
//         int cs = arr[0];
//         int ms = arr[0];
        
//         for(int i = 1; i < n; i++){
//             cs += arr[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(ms , cs);
//         }
//         System.out.println(ms);
//     }
// }









// handles negative values (that is, when all elements are negative in the array) | does not print the subarray:

public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        // int[] arr = {-2 , -5 , -3 , -7};
        int n = arr.length;
        
        int cs = arr[0];
        int ms = arr[0];
        
        for(int i = 1; i < n; i++){
            if(cs + arr[i] > arr[i]){
                cs += arr[i];
            }
            else{
                cs = arr[i];
            }
            ms = Math.max(ms , cs);
        }
        System.out.println(ms);
    }
}










// handles negative values (that is, when all elements are negative in the array) | prints subarray

// public class kadanesAlgo {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, -2, 7, -4};
//         // int[] arr = {-2, -3, -7, -2, -10, -4};
//         int n = arr.length;
        
//         int cs = arr[0];
//         int ms = arr[0];

//         int tempStart = 0;
//         int start = 0;
//         int end = 0;
        
//         for(int i = 1; i < n; i++){
//             if(cs + arr[i] > arr[i]){
//                 cs += arr[i];
//             }
//             else{
//                 cs = arr[i];
//                 tempStart = i;
//             }
            
//             if(cs > ms){
//                 ms = cs;
//                 start = tempStart;
//                 end = i;
//             }
//         }
//         System.out.println("max sum: " + ms);
//         for(int i = start; i <= end; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }