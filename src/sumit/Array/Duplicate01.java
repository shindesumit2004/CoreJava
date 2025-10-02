package sumit.Array;

public class Duplicate01 {
    public static void main(String[] args) {
        int[] number = {1,4,5,4,6,11,77,8,9,10,44,78,77,44};
        int temp[] = new int[number.length];
        int max;

        for (int i=0; i< number.length; i++){
            for(int j=0; j< number.length; j++){
                if(number[i] == number[j]){
                    temp[i] = number[j];
                    System.out.println("Duplicate Array:" +number[j]);

                }
            }
        }
        max=temp[0];
        for (int i=0; i< number.length; i++){
            if (temp[i]> max){
                max=temp[i];

            }
        }
        System.out.println(max);
    }

}
