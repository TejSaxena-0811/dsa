package hashing;


// import java.util.HashMap;

// public class hashMap2 {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 2, 1, 3};

//         HashMap<Integer, Integer> hash = new HashMap<>();

//         // precomputing
//         for (int num : arr) {
//             if (hash.containsKey(num)) {
//                 // If the number is already present, increment its count
//                 hash.put(num, hash.get(num) + 1);
//             } else {
//                 // If the number is not present, add it with count 1
//                 hash.put(num, 1);
//             }
//         }

//         // fetching
//         if (hash.containsKey(1)) {
//             System.out.println(hash.get(1)); // prints 2
//         } else {
//             System.out.println(0);
//         }
//     }
// }







// using string:

// import java.util.HashMap;

// class Main {
//     public static void main(String[] args) {
//         String str = "abcbde";

//         HashMap<Character, Integer> hash = new HashMap<>();

//         // precomputing
//         for (char ch : str.toCharArray()) {
//             if (hash.containsKey(ch)) {
//                 hash.put(ch, hash.get(ch) + 1);
//             } else {
//                 hash.put(ch, 1);
//             }
//         }

//         // fetching
//         if (hash.containsKey('z')) {
//             System.out.println(hash.get('a'));
//         } else {
//             System.out.println(0);
//         }
//     }
// }









// without using hashmap...using arrays:

public class hashMap2{
    public static void main(String[] args) {
        String str = "abcbdez";
        int n = str.length();
        int[] newArr = new int[26];  //  Use int[26] when you're dealing strictly with 'a' to 'z'. Use int[256] if you're counting any ASCII character (letters, symbols, whitespace, etc.).
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            newArr[ch-'a'] = newArr[ch-'a'] + 1;  // ch-'A' for uppercase
        }

        // for(int ch: newArr){
        //     System.out.println(ch);
        // }

        System.out.println(newArr['z'-'a']);  // checking for z
    }
}




// HashMap<Long , ...>  --->  can store till 10^18.