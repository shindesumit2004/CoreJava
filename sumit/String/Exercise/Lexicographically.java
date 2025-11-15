package sumit.String.Exercise;

public class Lexicographically {

    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";

        int result = str1.compareTo(str2);

        if (result == 0){
            System.out.println("It is equal");
        }else if (result < 0){
            System.out.println(str1+" Comes Before " + str2);
        }else{
            System.out.println(str1+" comes after "+str2);
        }



    }
}
