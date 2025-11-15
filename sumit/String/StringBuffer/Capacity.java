package sumit.String.StringBuffer;

public class Capacity {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("Java");
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer(" Programming");
        System.out.println(sb1.append(sb2));
        System.out.println(sb2.capacity());

        System.out.println();
    }
}
