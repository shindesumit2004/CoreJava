package OOPs.MethodOverloading;

public class OverloadDemo {
    void show(int a) {
        System.out.println("Integer : " + a);
    }
    void show(int a, int b){
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.show(5);
        obj.show(5, 10);

    }
}
