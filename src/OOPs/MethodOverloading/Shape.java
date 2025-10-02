package OOPs.MethodOverloading;

public class Shape {
    void area(int side){
        System.out.println("Square area: " + (side * side));
    }
    void area(int l, int b){
        System.out.println("Rectangle area: " + (l * b));
    }
    void area(double r) {
        System.out.println("Circle area : " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);
        s.area(5, 10);
        s.area(7.5);
    }
}
