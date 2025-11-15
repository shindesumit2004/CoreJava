package sumit.String.Exercise;

public class Unicode {
    public static void main(String[] args) {

        String str = "Java Program";

        System.out.println("original str : " + str);

        int val1 = str.codePointAt(1);

        int val2 = str.codePointAt(9);

        System.out.println("Character (unicode point) = " + val1);

        System.out.println("Character (unicode point) = " + val2);
    }
}
