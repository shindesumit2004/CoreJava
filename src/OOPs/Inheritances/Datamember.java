package OOPs.Inheritances;
class Ab {
    int a = 10;
}

class Ba extends Ab {
    int b = 20;
}
public class Datamember{
    public static void main(String[] args) {
        Ba obj = new Ba();
        System.out.println("a = " + obj.a +", b = " + obj.a );
    }
}
