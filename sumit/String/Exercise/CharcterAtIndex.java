package sumit.String.Exercise;

public class CharcterAtIndex {
    public static void main(String[] args) {

        String str = "Java Exercise";
        System.out.println("Original String = " + str );

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The Character at position 0 is " + (char)index1);
        System.out.println("The Character at position 0 is " + (char)index2);

    }
}
