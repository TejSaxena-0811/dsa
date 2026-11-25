// playing cards

// do dry run for better understanding.

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int curr = i;
            int next = arr[i + 1];       // next element to be inserted

            // Find the correct position to insert
            while (curr >= 0 && arr[curr] > next) {
                arr[curr + 1] = arr[curr]; // shift right
                curr--;  // after the first iteration, curr becomes -1.
            }

            // Insertion
            arr[curr + 1] = next;  // so here, -1 + 1 = 0, so arr[0] = next, that is, 4.
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
