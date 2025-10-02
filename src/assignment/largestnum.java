package assignment;

public class largestnum {
    public static void main(String[] args) {
        int a =78;
        int b=80;
        int c=85;
        int Largest;

        if(a >= b && a >= c){
            Largest = a;

        } else if (b >= a && b >= c) {
            Largest = b;

        }else{
            Largest = c;

        }
        System.out.println("The largest number is " + Largest );
    }
}
