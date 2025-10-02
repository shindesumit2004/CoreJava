package sumit.Array;

public class Addevenodd {
   /* public static void main(String[] args) {
        int arr[]={8,8,2,2,4,5,6,7,7,9};

        int oddplace=0;
        int evenplace=0;

        for(int i =0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenplace = evenplace + arr[i];
            }
            else {
                oddplace = oddplace+arr[i];
            }

        }
        System.out.println("Addition of even number" + evenplace);
        System.out.println("Addition of odd num : "+oddplace);

    }*/

    public static void main(String[] args) {
        int[] arr={8,5,6,8,5,7,8,4,6};

        int oddplace=0;
        int evenplace=0;

                for(int i=0; i< arr.length; i++){
                    if (arr[i] % 2 == 0){

                        evenplace = evenplace + arr[i];
                    }else{
                        oddplace = oddplace + arr[i];
                    }
                    System.out.println("Addition of even number :" +evenplace);
                    System.out.println("Addition of odd number :" +oddplace);
                }
    }


}
