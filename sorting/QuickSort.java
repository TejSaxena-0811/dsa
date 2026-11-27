public class QuickSort {
    public static void quickSort(int[] arr , int si , int ei){
        if(si >= ei){
            return;
        }
        int pivotIdx = partition(arr , si , ei);
        quickSort(arr, si, pivotIdx-1);  // left
        quickSort(arr, pivotIdx+1, ei);  // right

    }

    // the purpose of this function is to find the index of the pivot element, when it is in the middle
    public static int partition(int[] arr , int si , int ei){
        int pivot = arr[ei];  // the last element of the array is chosen as the pivot element.
        int i = si-1; // to make place for elements smaller than pivot element...so i is set to -1.

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swapping:
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now swapping for pivot index:
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {6,3,-9,8,2,5};
        quickSort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
