package OOPs.MethodOverloading;

public class WrapperOverload {
    void show(Integer a){
        System.out.println("Integer Wrapper: " + a);
    }
    void show(double a){
        System.out.println("Double wrapper: " + a);
    }

    public static void main(String[] args) {
        WrapperOverload obj = new WrapperOverload();

        obj.show(25);
        obj.show(15.7);
    }
}
