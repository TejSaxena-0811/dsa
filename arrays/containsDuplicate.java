// leetcode 217


import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.contains(arr[i])){
                System.out.println(true);
                return;
            }
            set.add(arr[i]);
        }
        System.out.println(false);
    }
}
