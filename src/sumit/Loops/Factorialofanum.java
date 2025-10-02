package sumit.Loops;

public class Factorialofanum {
    public static void main(String[] args) {


        // 6! = 6.5.4.3.2.1

        int n = 8;
        int res = 1;
        while (n > 0) {
            res = res * n;
            n--;

        }
        System.out.println(res);

    }
}