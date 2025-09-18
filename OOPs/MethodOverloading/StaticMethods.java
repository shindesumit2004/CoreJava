package OOPs.MethodOverloading;

public class StaticMethods {
    static void display(int a){
        System.out.println("Static method with int : " + a);
    }
    static void display(String s){
        System.out.println("Static method with String: " + s);
    }

    public static void main(String[] args) {
        StaticMethods.display(50);
        StaticMethods.display("Overloading Example");
    }
}
