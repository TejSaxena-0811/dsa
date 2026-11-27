// if having trouble understanding, check notes.

public class oddOrEven{
    public static void main(String[] args){
        int n = 3;  // 011
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}