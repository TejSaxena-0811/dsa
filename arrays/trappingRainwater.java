



// leetcode 42



// easy
// brute: (tc: O(3n) = O(n) , sc: O(n))
// using auxilliary arrays
// public class trappingRainwater{
//     public static int trappedRainwater(int[] height){
//         int n = height.length;
//         // int width = 1;  // Given: width of each bar is 1.

//         int[] leftMax = new int[n];
//         leftMax[0] = height[0];
//         for(int i = 1; i < height.length; i++){
//             leftMax[i] = Math.max(height[i] , leftMax[i-1]);
//         }

//         int[] rightMax = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i = n-2; i >= 0; i--){
//             rightMax[i] = Math.max(height[i] , rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         for(int i = 0; i < n; i++){
//             int waterLevel = Math.min(leftMax[i] , rightMax[i]);
//             trappedWater += (waterLevel - height[i]); // formula
//         }

//         return trappedWater;
//     }
//     public static void main(String[] args){
//         int[] height = {4,2,0,6,3,2,5};
//         System.out.println(trappedRainwater(height));
//     }
// }











// optimized: (tc: O(n) , sc: O(1))
public class trappingRainwater{
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        int n = height.length;

        int l = 0; int r = n-1;

        int leftMax = 0; int rightMax = 0;

        int trappedWater = 0;

        while(l < r){
            leftMax = Math.max(leftMax , height[l]);
            rightMax = Math.max(rightMax , height[r]);

            if(leftMax < rightMax){
                trappedWater += (leftMax - height[l]);
                l++;
            }
            else{
                trappedWater += (rightMax - height[r]);
                r--;
            }
        }

        System.out.println(trappedWater);
    }
}