// palindrome checker using recursion.

public class palindrome {
    public static void print(String str , StringBuilder rev , int i){
        if(i < 0){  // base case
            // System.out.println(rev);
            if(str.equals(rev.toString())){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            return;
        }
        rev.append(str.charAt(i));
        print(str, rev, i-1);
        
    }
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("");

        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        int n = str.length();

        StringBuilder sb2 = new StringBuilder("");

        for(int i = 0; i < n; i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                sb2.append(str.charAt(i));
            }
        }

        int n1 = sb2.length();
        print(sb2.toString() , sb1 , n1-1);
    }
}





// public class Solution {
//     public boolean isPalindrome(String s) {
//         // Preprocess the string by removing non-alphanumeric characters and converting to lowercase
//         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
//         // Start recursion with left and right pointers
//         return isPalindromeRecursive(s, 0, s.length() - 1);
//     }
    
//     // Helper recursive method
//     private boolean isPalindromeRecursive(String s, int left, int right) {
//         // Base case: if pointers cross, we have checked all characters
//         if (left >= right) {
//             return true;
//         }
        
//         // If characters don't match, return false
//         if (s.charAt(left) != s.charAt(right)) {
//             return false;
//         }
        
//         // Recursive call with the next pair of characters
//         return isPalindromeRecursive(s, left + 1, right - 1);
//     }
// }










// public class palindrome {
//     public static void main(String[] args) {
//         String str = "A man, a plan, a canal: Panama";
//         str = str.toLowerCase();
//         int n = str.length();
//         int left = 0;
//         int right = n-1;
//         while(left <= right){
//             if(!Character.isLetterOrDigit(str.charAt(left))){
//                 left++;
//                 continue;
//             }
//             if(!Character.isLetterOrDigit(str.charAt(right))){
//                 right--;
//                 continue;
//             }
//             if(str.charAt(left) != str.charAt(right)){
//                 System.out.println(false);
//                 return;
//             }
//             left++;
//             right--;
//         }
//         System.out.println(true);
//     }
// }




