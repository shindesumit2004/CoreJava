package sumit.Array;

public class SumOfAllElement {


        public static void main(String[] args) {
            int[] array = {3,2,6,9,10,1,4,8,5,7};
            //
            int num = 0;

            for(int i = 0; i < array.length; i++){
                num = num + array[i];
            }

            System.out.println("Result is "+num);
        }


}
