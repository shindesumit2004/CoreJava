package sumit.Swapping;

import java.util.Scanner;

public class Copyarray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] original = new int[size];
        int[] copy = new int[size];


        System.out.println("Enter " + size + " elements :");
        for (int i = 0; i < size; i++) {
            original[i] = original[i];
        }

        for (int i = 0; i < size; i++){
            copy[i] = original[i];
        }
        System.out.println("Copied array:");
        for (int i = 0; i < size; i++){
            System.out.println(copy[i] + " ");
        }


    }
}
