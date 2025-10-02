package sumit.Swapping;

public class P1 {

    public static void main(String[] args) {
        int a = 300;
        int b = 20;

        System.out.println("Before swapping value a =" + a + ", b ="+ b );

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping Value a = " + a + ", b =" + b);
    }
}
