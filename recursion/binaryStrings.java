// not clear

// Write a program to print all binary strings of length n such that no two 1s appear consecutively.

public class binaryStrings {
    public static void binStrings(int n , int prevPlace, String str){
        if(n == 0){  // base case
            System.out.println(str);
            return;
        }

        if(prevPlace == 0){
            binStrings(n-1, 0, str+"0");
            binStrings(n-1, 1, str+"1");
        }
        else{
            binStrings(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        binStrings(3,0, "");
    }
}
