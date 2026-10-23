// check if array is sorted and rotated

// leetcode 1752

public class checkIfSortedRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }

        if(count <= 1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
