// package String;

public class Construct_String {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("Hello, World!");

        String s3 = "xyz";
        String s4 = new String(s3);

        // char array
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };
        String s5 = new String(arr);

        System.out.println(s5);

        // Char array subset
        String s6 = new String(arr, 0, 3);
        System.out.println(s6);


        // byte array
        byte[] arr2 = {97,89,99};
        String s7 = new String(arr2);
        System.out.println(s7);
    }
}
