package OOPs.MethodOverloading;

public class NullArgument {
    void test(String s){
        System.out.println("String method");
    }
    void test(Object o){
        System.out.println("Object method");
    }

    public static void main(String[] args) {
        NullArgument obj = new NullArgument();
        obj.test(null);
    }
}
