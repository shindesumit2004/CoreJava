package sumit.String;

public class Equal2 {
    public static void main(String[] args) {
        String str = new String("Java");

        String str2 = str.intern();

        String str1 = "Java";

        System.out.println(str == str2);
        System.out.println(str2 == str1);
    }
}
