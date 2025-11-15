package sumit.String;

public class Trim {
    public static void main(String[] args) {
        String name = " abc ";
        String s = name.trim();
        System.out.println(s);
        if(name.trim().length()==0){
            System.out.println(name.length());
        }
    }
}
