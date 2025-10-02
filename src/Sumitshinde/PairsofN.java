package Sumitshinde;

public class PairsofN {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int N = 10;



        System.out.println("Pairs with sum" + N + ":");

        for (int i=0; i< arr.length; i++){
            for ( int j=i+1; j< arr.length; j++){
                if (arr[i] + arr[j] == N) {
                    System.out.println(arr[i] + " + " +arr[j] + " = " + N);
                }
            }
        }

    }


}
