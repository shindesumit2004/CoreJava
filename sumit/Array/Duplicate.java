package sumit.Array;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={8,8,2,2,4,5,6,7,7,9};
        int temp[] = new int[arr.length];
        int max;

        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]) {
                    temp[i] =arr[j];
                    System.out.println("Duplicate array:" + arr[j]);
                }
            }

        }
        max = temp[0];
        for (int i =0; i< arr.length; i++){
            if (temp[i] > max){
                max = temp[i];
            }
        }
        System.out.println(max);




    }
}
