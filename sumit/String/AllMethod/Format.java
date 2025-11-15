package sumit.String.AllMethod;

public class Format {
    public static void main(String[] args) {
        String str = "Sumit";
        int age = 22;

        String result = String.format("My name is %s and I am %d year old." ,str,age);
        System.out.println(result);
    }
}
