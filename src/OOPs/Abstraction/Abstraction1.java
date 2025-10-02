package OOPs.Abstraction;

interface Vehicle0 {
    void start();
    void stop(); //Abstract Method

}
class Car0 implements Vehicle0{
    @Override
    public void start() {
        System.out.println("Car is Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopping");
    }
}


public class Abstraction1 {
    public static void main(String[] args) {
        Vehicle0 v = new Car0(); //Upcasting
        v.start();
        v.stop();
    }

}
