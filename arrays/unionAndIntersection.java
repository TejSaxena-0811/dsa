import java.util.Arrays;

public class unionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1,2,7};
        int[] union = new int[arr1.length + arr2.length];  // max possible size of the union array
        int[] intersection = new int[Math.min(arr1.length , arr2.length)];  
        
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(k == 0 || union[k-1] != arr1[i]){
                    union[k] = arr1[i];
                    k++;
                }
                i++;
            }
            else if( arr2[j] < arr1[i]){
                if(k == 0 || union[k-1] != arr2[j]){
                    union[k] = arr2[j];
                    k++;
                }
                j++;
            }
            else{  // if arr1[i] == arr2[j]
                if(m == 0 || intersection[m-1] != arr1[i]){
                    intersection[m] = arr1[i];
                    m++;
                }
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
        System.out.println();
        System.out.println(Arrays.toString(intersection));
    }
}


// can use Arrays.copyOf() function to print properly.

// System.out.println(Arrays.toString(Arrays.copyOf(union , k)));
// System.out.println(Arrays.toString(Arrays.copyOf(intersection , m)));

// syntax:
// Arrays.copyOf(originalArray, newLength);
