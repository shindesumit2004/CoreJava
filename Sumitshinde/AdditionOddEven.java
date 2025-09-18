package Sumitshinde;

public class AdditionOddEven {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, 9, 6, 3, 5, 4, 8,};

        int oddplace = 0;
        int evenplace = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenplace = evenplace + array[i];
            } else {
                oddplace = oddplace + array[i];
            }


        }
        System.out.println("Addition of even number" + evenplace);
        System.out.println("Addition of odd number" + oddplace);
    }
}
