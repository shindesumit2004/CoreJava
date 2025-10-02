package OOPs.Abstraction;

abstract class Test{
    abstract void show();
    static void display(){
        System.out.println("Static Method in abstract class");
    }
}
class Demo extends Test {
    @Override
    void show() {
        System.out.println("Implemented show()");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Test.display();
        Test t = new Demo();
                t.show();
    }
}
