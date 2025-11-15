package sumit.String;

public class ReverseStringEmpty {
    public static void main(String[] args) {

        String str = "Sumit";
        String rev = " ";

        for (int i = str.length() - 1; i >= 0; i--){

            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is : " + rev);
    }
}


 class Reverse1{
     public static void main(String[] args) {

         String str = "PROGRAMMING";
         String rev = "";

         for (int i = str.length()-1; i >= 0; i--){
             rev = rev + str.charAt(i);

         }
         System.out.println(rev);
     }
 }