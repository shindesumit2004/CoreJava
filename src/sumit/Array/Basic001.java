package sumit.Array;

public class Basic001 {
    public static void main(String[] args) {
        System.out.println("Sum of all element : ");


        int[] array = {5, 9, 1, 7, 6, 2, 8, 2, 9};
        int sum = 0;
        for (int i=0; i<= array.length; i++){

            sum += array[i];

            System.out.print(sum);
        }

    }
}
