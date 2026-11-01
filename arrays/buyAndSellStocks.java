// public class buyAndSellStocks {
//     public static void main(String[] args){
//         int[] prices = {7,1,5,3,6,4};
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i < prices.length; i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit , profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
        
//         System.out.println(maxProfit);
//     }
// }






// follow this one:


// better:

// At each price, it assumes:
// "What if I buy at the lowest price seen so far and sell today?"
// It updates min and maxProfit as it goes, based on that logic.

// public class buyAndSellStocks {
//     public static void main(String[] args) {
//         // int[] arr = {7,1,5,3,6,4};
//         int[] arr = {3, 2, 6, 1, 4};
//         int min = Integer.MAX_VALUE;
//         int profit = 0; // this should be 0 only, not -infinity. because the minimum valid answer is 0, not a negative number.
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//             else if(arr[i] - min > profit){
//                 profit = arr[i] - min;
//             }
//         }
//         System.out.println(profit);
//     }
// }







// print the buyDay and the sellDay

public class buyAndSellStocks {
    public static void main(String[] args) {
        // int[] arr = {7,1,5,3,6,4};
        int[] arr = {3, 2, 6, 1, 4};

        int tempBuyDay = 0; int buyDay = 0; int sellDay = 0;

        int min = Integer.MAX_VALUE;
        int profit = 0; // this should be 0 only, not -infinity. because the minimum valid answer is 0, not a negative number.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                tempBuyDay = i;
            }
            else if(arr[i] - min > profit){
                profit = arr[i] - min;
                buyDay = tempBuyDay;
                sellDay = i;
            }
        }
        System.out.println("Profit: " + profit);

        System.out.println("buyDay: " + buyDay); // index
        System.out.println("sellDay: " + sellDay); // index
    }
}