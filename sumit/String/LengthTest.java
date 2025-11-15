package sumit.String;

public class LengthTest {
    public static void main(String[] args) {
        String name = "abc";
        String email = "abc@gmail.com";
        String pass = "abc123";
        System.out.println(name.length());
        int i = name.length();
        if(i==0){
            System.out.println("name is empty");
        }
    }
}
