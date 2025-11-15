package sumit.String;

public class ReverseChar {
    public static void main(String[] args) {

        String str = "sumit";

        char[] arr = str.toCharArray();
        System.out.println("Reversed string ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}