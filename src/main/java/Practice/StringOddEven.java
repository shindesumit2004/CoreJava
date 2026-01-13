package Practice;

public class StringOddEven {
    public static void main(String[] args) {

        String str = "Hello";
        char[] arr = str.toCharArray();

        for (int i=0; i<= arr.length; i++){
            if (i % 2 == 0){
                System.out.println("Even is "+ i);
            }else {
                System.out.println("Odd is " + i);
            }
        }
    }
}
