package sumit.Loops;
import java.util.Scanner;

public class Tables {

    /*public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();

       for(int i = 1; i <= 10; i++) {
            System.out.println(a +" X "+i+" = " + i * a);
        }
    }*/

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println( a+ " X "+i+" = " + i * a);
        }
        System.out.println("Enter a number to create table");
    }



}
