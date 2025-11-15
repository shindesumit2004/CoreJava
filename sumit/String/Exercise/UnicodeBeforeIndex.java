package sumit.String.Exercise;

public class UnicodeBeforeIndex {
   /* public static void main(String[] args) {

        String str = "Java Program";

        System.out.println("Original string : " + str);

        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(7);

        System.out.println("Character(Unicode point) = " +val1);
        System.out.println("Character(Unicode point) = "+val2);
    }*/
   public static void main(String[] args) {
       String str = "Java Program";

       int val1 = str.codePointAt(2);
       int val2 = str.codePointAt(4);

       System.out.println("Character of (Unicode) is = " + val1);
       System.out.println("Character of (Unicode) is = " + val2);
   }
}
