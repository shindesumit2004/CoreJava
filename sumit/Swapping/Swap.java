package sumit.Swapping;

public class Swap {

    public static void main(String[] args) {

        int a = 10;
        int b = 8;

        a = a + b ;
        b = a - b ;
        a = a - b ;


       /* int temp = a;
        a = b;
        b = temp;*/

        System.out.println("after Swapping value : a = "+ a +", b = "+ b );
    }
}
