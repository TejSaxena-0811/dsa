// rotate matrix by 90 degrees...leetcode 48





// brute force:
// using extra space

// In a 90-degree clockwise rotation, each element in the matrix moves from its original position to a new position based on a specific pattern. The first column becomes the first row (in reverse order) and second column becomes the second row, and so on.
// We can simulate this movement by using a new matrix. For each element at position (i, j) in the original matrix, we calculate its new position in the rotated matrix as (j, n - i - 1) where n is the size of the matrix.
// Initialize an empty matrix of the same size (n x n).
// Loop through every element of the original matrix using two nested loops.
// For each element at position (i, j), place it in the new matrix at position (j, n - i - 1).
// After completing the placement for all elements, return or copy the new matrix.

import java.util.*;
public class rotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;

        // Extra matrix for brute-force rotation
        int[][] rotated = new int[n][n];

        // Rotate 90 degrees clockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = arr[i][j];
            }
        }

        // Print rotated matrix
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(rotated[i]));
        }
    }
}








// optimized:

// public class rotateMatrix {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int n = arr.length;
        
//         // transpose the matrix
//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j < n; j++){
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }
        
//         // reverse every row
//         for(int i = 0; i < n; i++){
//             int left = 0;
//             int right = n-1;
            
//             while(left < right){
//                 int temp = arr[i][left];
//                 arr[i][left] = arr[i][right];
//                 arr[i][right] = temp;
//                 left++;
//                 right--;
//             }
//         }
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }












// using reverse function:

// public class rotateMatrix{
//     public static int[] reverse(int[] arr , int start , int end){
//         while(start <= end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int n = arr.length;
//         int m = arr[0].length;

//         // transpose
//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j < m; j++){
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }

//         // reverse every row
//         for(int i = 0; i < n; i++){
//             reverse(arr[i] , 0 , n-1);
//         }

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }