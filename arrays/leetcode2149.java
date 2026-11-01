// rearrange array elements by sign



// O(n) time and O(n) space ... did this one completely by myself

import java.util.*;
public class leetcode2149 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,-1,-3,-4};
        // int[] arr = {-1,2,3,4,-3,1};
        int n = arr.length;
        
        int[] a1 = new int[n/2];  // this array will store all positive elements
        int[] a2 = new int[n/2];  // this array will store all negative elements
        
        int[] newArr = new int[n];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(int a = 0; a < n; a++){
            if(arr[a] > 0){
                a1[i] = arr[a];
                i++;
            }
            else if(arr[a] < 0){
                a2[j] = arr[a];
                j++;
            }
        }
        
        i = 0; j = 0;
        while(i < a1.length && j < a2.length){
            if(k%2 == 0){
                newArr[k] = a1[i];
                i++; k++;
            }
            else{
                newArr[k] = a2[j];
                j++; k++;
            }
        }
        
        
        while(i < a1.length){
            newArr[k] = a1[i];
            i++; k++;
        }
        
        while(j < a2.length){
            newArr[k] = a2[j];
            j++; k++;
        }
        
        System.out.println(Arrays.toString(newArr));
    }
}









// O(n) time and O(n) space...this is slightly better

// import java.util.*;
// public class leetcode2149 {
//     public static void main(String[] args) {
//         int[] arr = {3,1,-2,-5,2,-4};
//         int n = arr.length;
        
//         int[] newArr = new int[n];
        
//         int pos = 0; int neg = 1;
        
//         for(int i = 0; i < n; i++){
//             if(arr[i] > 0){
//                 newArr[pos] = arr[i];
//                 pos += 2;
//             }
//             else if(arr[i] < 0){
//                 newArr[neg] = arr[i];
//                 neg += 2;
//             }
//         }
        
//         System.out.println(Arrays.toString(newArr));
//     }
// }








// followup question: what if the number of positive and negative elements is not the same?:

// solve this using ArrayLists later after learning about them...MAKE SURE TO DO IT!! ... update, this is the code:


// import java.util.*;
// public class leetcode2149 {
//     public static void main(String[] args) {
//         int[] arr = {3, -1, -2, 4, -5, 6, 7};
//         int n = arr.length;
        
//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();
        
//         int[] newArr = new int[n];
        
//         for(int i = 0; i < n; i++){
//             if(arr[i] > 0){
//                 pos.add(arr[i]);
//             }
//             else if(arr[i] < 0){
//                 neg.add(arr[i]);
//             }
//         }
        
//         int i = 0; int j = 0; int k = 0;
        
//         while(i < pos.size() && j < neg.size()){
//             if(k%2 == 0){
//                 newArr[k] = pos.get(i);
//                 i++;
//             }
//             else{
//                 newArr[k] = neg.get(j);
//                 j++;
//             }
//             k++;
//         }
        
//         while(i < pos.size()){
//             newArr[k] = pos.get(i);
//             i++; k++;
//         }
//         while(j < neg.size()){
//             newArr[k] = neg.get(j);
//             j++; k++;
//         }
        
//         System.out.println(Arrays.toString(newArr));
//     }
// }