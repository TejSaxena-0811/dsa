// add 1 to a number without using the plus operator...so use bits.

public class add_one {
    public static void main(String[] args){
        int x = 5;
        int result = -(~x);  // ~x gives -6.

        System.out.println("Original: " + x);
        System.out.println("After adding 1: " + result);
    }
}
