package sumit.SKExercise;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (n) : ");

        int n = sc.nextInt();

        System.out.println("Natural a number ");
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }

    }
}
