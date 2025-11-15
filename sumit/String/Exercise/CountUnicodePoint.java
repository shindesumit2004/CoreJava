package sumit.String.Exercise;

public class CountUnicodePoint {/*
    public static void main(String[] args) {

        String str = "Java Program";

        System.out.println("Original String : " + str);

        int ctr = str.codePointCount(1,8);

        System.out.println("CodePoint count = " + ctr);
    }*/

    public static void main(String[] args) {

        String str = "Java Program";

        int ctr = str.codePointCount(1,3);

        System.out.println("Code count point = "+ ctr);
    }
}
