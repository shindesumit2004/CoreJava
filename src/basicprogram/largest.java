package basicprogram;

public class largest {
    public static void main(String[] args) {
        int a=70;
        int b=75;
        int c=78;
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        }
        else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("The largest number is " + largest );
    }
}
