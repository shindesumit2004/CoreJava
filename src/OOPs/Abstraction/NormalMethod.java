package OOPs.Abstraction;
abstract class Vehicle3{
    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }
}
class Car3 extends Vehicle3{

    @Override
    void start() {
        System.out.println("Car Started");
    }
}

public class NormalMethod {
    public static void main(String[] args) {
        Vehicle3 v = new Car3();
        v.start();
        v.stop();
    }
}
