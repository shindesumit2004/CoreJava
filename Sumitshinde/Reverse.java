package Sumitshinde;

public class Reverse {
    public static void main(String[] args) {



        int[] array ={10,20,30,40,50,60,70,80,90};

       for (int i=0; i<array.length; i++){

           for(int j=0; j< array.length; j++){
               if(array[i] > array[j]){
                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
       }
        System.out.print("Element in array : ");
       for (int i=0; i< array.length; i++){
           System.out.print(array[i]+" ");
       }

    }
}
