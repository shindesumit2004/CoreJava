package OOPs.MethodOverloading;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Main with String[]");
        main(5);
        main("hello");
    }

    public static void main(int a) {
        System.out.println("Main with int: " + a);

    }

    public static void main(String s) {
        System.out.println("Main with String: " + s);

    }
}
