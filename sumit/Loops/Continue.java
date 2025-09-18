package sumit.Loops;

public class Continue {
    public static void main(String[] args) {

        int i = 1;
        while (i<1000){
            if(i<=550){
                i++;
                continue;

            }
            System.out.println(i);
            i++;
        }
    }
}
