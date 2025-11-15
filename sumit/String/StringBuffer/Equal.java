package sumit.String.StringBuffer;

public class Equal {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Deepak java");
        StringBuffer sb2 = sb.append("Hi");

        System.out.println(sb.equals(sb2));
    }
}
