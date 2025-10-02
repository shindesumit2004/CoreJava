package OOPs.MethodOverloading;

public class TypePromotion {
    void test(int a, double b){
        System.out.println("int-double version: " + (a + b));
    }
    void test(double a, int b){
        System.out.println("double-int version: " + (a + b));
    }

    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();

        obj.test(5, 6.5);
        obj.test(7.5, 5);

    }
}
