/*package Sumitshinde;

public class JavaPractice {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        int temp;

       int sum = 0;
        for (int i=0; i<array.length ; i++){

            sum += array[i];0
        }
        System.out.println(sum);

        for (int  i=array.length-1; i>=0; i--) {

            System.out.print(array[i]);
        }

        for (int i= array.length-1; i>=0; i--){

            System.out.println(array[i]);
        }

        int oddplace = 0;
        int evenplace = 0;
        for (int i=0; i < array.length; i++){

            if(array[i] % 2 == 0) {
                evenplace = evenplace + array[i];
            }
            else {
                oddplace = oddplace + array[i];
            }
        }
        System.out.println("Addition of even number is : " + evenplace);
        System.out.println("Addition of odd number is : " + oddplace);

        int oddplace = 0;
        int evenplace = 0;

        for (int i=0; i<array.length; i++){

            if (array[i] % 2 == 0) {
                evenplace = array[i];
                System.out.println("Print even number : "+ evenplace);

            }else{
                oddplace =  array[i];
                System.out.println( " print odd number : "+oddplace);


            }
        }
        //System.out.println("Addition of even number : "+ evenplace);
        //System.out.println("Addition of odd number : "+ oddplace);


    }
}



        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 1, 3};

            // Bubble Sort
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        // Swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            // Print Sorted Array
            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }



    public static void main(String args[]) {

        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};

        System.out.println("April has " + month_days[3] + "days.");

    }
}

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}*/



