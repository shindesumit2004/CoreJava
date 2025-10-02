package OOPs.Abstraction;



abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{

    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
public class MultipleSubClass {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        s1.draw();
        s2.draw();
    }
}
