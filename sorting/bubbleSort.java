// optimized

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        // int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;  // variable swapped is initialized here so it can be reset for each outer loop iteration.

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                if (i == 0) {
                    System.out.println("Array is already sorted");
                    return;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
