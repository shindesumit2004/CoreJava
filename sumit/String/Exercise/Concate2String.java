package sumit.String.Exercise;

public class Concate2String {

    public static void main(String[] args) {

        String str1 = "PHP Exercise and ";
        String str2 = "Java Exercise";

        System.out.println("String 1 : " +str1);
        System.out.println("String 2 : " +str2);

        String str3 = str1.concat(str2);

        System.out.println("The Concatenated String : " +str3);
    }
}
