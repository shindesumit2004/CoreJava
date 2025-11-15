package sumit.String.StringBuffer;

public class Equal2{
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("ab");
        StringBuffer sb2 = sb.append("bcci");

        System.out.println(sb.equals(sb2));
    }
}
