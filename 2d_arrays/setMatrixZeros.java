// the minimum time complexity has to be O(n^2) because that much time is taken to traverse the 2d matrix. so in the optimized one, we will be optimizing the space complexity.



// tc: O(n^2) ... sc: O(n)

// public class setMatrixZeros {
//     public static void main(String[] args) {
//         int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
//         int n = arr.length;
//         int m = arr[0].length;
        
//         int[] rows = new int[n];
//         int[] cols = new int[n];
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(arr[i][j] == 0){
//                     rows[i]=1;
//                     cols[j]=1;
//                 }
//             }
//         }
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(rows[i] == 1 || cols[j] == 1){
//                     arr[i][j] = 0;
//                 }
//             }
//         }
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }









// optimized: [tc: O(n^2) ... sc: O(1)]

public class setMatrixZeros{
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        // int[][] arr = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        
        int col0 = 1;
        
        // marking
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    
                    if(j != 0){
                        arr[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }
        
        // apply zeroes using markers
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[i][j] != 0){
                    if(arr[0][j] == 0 || arr[i][0] == 0){
                        arr[i][j] = 0;
                    }
                }
            }
        }
        
        // topmost horizontal
        if(arr[0][0] == 0){
            for(int j = 0; j < m; j++){
                arr[0][j] = 0;
            }
        }
        
        // leftmost vertical
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                arr[i][0] = 0;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}