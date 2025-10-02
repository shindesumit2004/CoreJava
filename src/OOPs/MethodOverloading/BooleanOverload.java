package OOPs.MethodOverloading;

public class BooleanOverload {
    void check(Boolean b){
        System.out.println("Boolean value : " + b);
    }
    void check(String s) {
        System.out.println("String value : " + s);
    }

    public static void main(String[] args) {
        BooleanOverload obj = new BooleanOverload();

        obj.check(true);
        obj.check("Hello");
    }
}
