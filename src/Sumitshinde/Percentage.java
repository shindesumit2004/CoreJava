package Sumitshinde;

public class Percentage {
    public static void main(String[] args) {
        int [] array = {1, 0, -1, -3, 5, 7, 8, 0};

        int total = array.length;
        int zero = 0, positive = 0, negative = 0;

        for (int i = 0; i < total; i++){
            if(array[i] == 0){
                zero++;

            } else if (array[i] >0) {
                positive++;


            }else {
                negative++;
            }
        }
        System.out.println("Percentage of zero: " + (zero * 100) / total + "%");
        System.out.println("Percentage of positive numbers:" + (positive * 100) / total + "%");
        System.out.println("Percentage of negative numbers:" + (negative * 100) / total + "%");
    }
}
