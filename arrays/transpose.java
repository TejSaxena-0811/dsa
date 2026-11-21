public class transpose {
    public static void main(String[] args) {
        int[][] arr = {
            {1,4,9},
            {11,4,3},
        };
        int n = arr.length;  // 2
        int m = arr[0].length;  // 3
        
        int[][] transpose = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                transpose[i][j] = arr[j][i];
            }
        }
        
        for(int i = 0; i < transpose.length; i++){
            for(int j = 0; j < transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}