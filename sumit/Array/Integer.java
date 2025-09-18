package sumit.Array;

public class Integer {

        public static void main(String[] args) {
            int[] numbers = {10, 25, 5, 40, 15};

            int sum = 0;
            int max = numbers[0];
            int min = numbers[0];

            System.out.print("Array Elements: ");
            for (int num : numbers) {
                System.out.print(num + " ");


                sum += num;


                if (num > max) {
                    max = num;
                }


                if (num < min) {
                    min = num;
                }
            }

            System.out.println("\nSum = " + sum);
            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);
        }
}