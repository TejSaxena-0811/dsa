import java.util.Arrays;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1,2,7};
        int[] union = new int[arr1.length + arr2.length];  // max possible size of the union array
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        if(arr1[0] <= arr2[0]){
            union[0] = arr1[0];
            k++; i++;
        }
        else{
            union[0] = arr2[0];
            k++; j++;
        }
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(union[k-1] != arr1[i]){
                    union[k] = arr1[i];
                    k++;
                }
                i++;
            }
            else if(arr2[j] < arr1[i]){
                if(union[k-1] != arr2[j]){
                    union[k] = arr2[j];
                    k++;
                }
                j++;
            }
            else{  // if arr1[i] == arr2[j]
                if(k == 0 || union[k-1] != arr1[i]){
                    union[k] = arr1[i];
                    k++;
                }
                i++; j++;
            }
        }
        
        while(i < arr1.length){
            if(union[k-1] != arr1[i]){
                union[k] = arr1[i];
                k++;
            }
            i++;
        }
        while(j < arr2.length){
            if(union[k-1] != arr2[j]){
                union[k] = arr2[j];
                k++;
            }
            j++;
        }
        
        System.out.println(Arrays.toString(union));
    }
}



// in the end, to only print the part of the union array with the numbers, and not with the empty 0s, do this:

// union = Arrays.copyOf(union , k); // Resize the union array to fit the actual number of elements
// System.out.println(Arrays.toString(union));

// System.out.println(Arrays.toString(Arrays.copyOf(union , k)));

// syntax:
// Arrays.copyOf(originalArray, newLength);