package strings;


// leetcode 1832


import java.util.*;
public class checkIfStringIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        int[] map = new int[26];

        char[] arrSentence = sentence.toCharArray();

        for(char c: arrSentence){
            map[c - 'a'] = 1;
        }

        for(int i = 0; i < map.length; i++){
            if(map[i] == 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
