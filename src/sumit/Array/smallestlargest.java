package sumit.Array;

public class smallestlargest {

        public static void main(String[] args) {
            int[] numbers = {1,4,5,4,6,11,77,8,9,10,44,78,77,44};
            int smallest = numbers[0];
            int largest = numbers[0];


            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
                else if(numbers[i] > largest) {
                    largest = numbers[i];
                }
            }
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }

}
