package sumit.String.Exercise;

public class CharcterAtIndex2 {
    public static void main(String[] args) {

        String str = "TekUpSkill Java By Prashant Sir";

        System.out.println("Original String : " + str);

        int index1 = str.charAt(2);
        int index2 = str.charAt(5);
        int index = str.charAt(7);

        System.out.println("The character of this position of 2 is : " + (char)index1);
        System.out.println("The character of this position of 5 is : " + (char)index2);
        System.out.println("The character of this position of 7 is : " + (char)index);

    }
}
