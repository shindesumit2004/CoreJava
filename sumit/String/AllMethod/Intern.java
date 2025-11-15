package sumit.String.AllMethod;

public class Intern {
    public static void main(String[] args) {/*

        String s1 = new String("Hello");
        String s2 = s1.intern();
        String s3 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        String str1 = new String("Hello");
        String str2 = str1.intern();
        String str3 = "Hello";

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);*/

        String str4 = new String("sumit");
        String str5 = str4.intern();
        String str6 = "sumit";

        System.out.println(str4 == str5);
        System.out.println(str5 == str6);
    }
}
