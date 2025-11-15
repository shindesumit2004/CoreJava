package sumit.String.StringBuffer;

public class Capacity2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Hello");
        System.out.println(sb.capacity());

        sb.append("Deepak Java");
        System.out.println(sb.capacity());

    }
}
