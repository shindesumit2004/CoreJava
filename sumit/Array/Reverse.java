package sumit.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {3,2,6,9,10,1,4,8,5,7};

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println("Elements in array "+array[i]);
        }
    }






}

