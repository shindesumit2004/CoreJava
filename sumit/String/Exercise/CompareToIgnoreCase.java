package sumit.String.Exercise;

public class CompareToIgnoreCase {
    public static void main(String[] args) {

        String str = "This is exercise 1";
        String str1 = "This is Exercise 1";

        System.out.println("String 1 : " + str);
        System.out.println("String 2 : " + str1);

        System.out.println(str + " CompareToIgnoreCase " + str1);

        System.out.println(str.equalsIgnoreCase(str1));
    }

}
