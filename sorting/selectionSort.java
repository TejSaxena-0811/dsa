// we will be dividing the complete array into unsorted (US) and sorted (S) parts. in the beginning the complete array is US. then we select element at index 0 as the minimum element. then we check the array elements that are after the element at index 0, and swap with minEl if there is a smaller one. so now, the smallest element is at the first index where it is supposed to be. so now, element at index 0 comes in the S part, and the rest of the elements are in the US part. similarly will be done for other elements.


// in this sorting, we first go through the complete array and find the smallest element, then place it in the beginning.


public class selectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){  // not going till the last element because, the last element will automatically be in its correct position after all previous minimums have been placed.
            int minEl = i;  // minimum element...storing the index, not value.
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minEl]){
                    minEl = j;
                }
            }
            //swapping:
            int temp = arr[minEl];
            arr[minEl] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
