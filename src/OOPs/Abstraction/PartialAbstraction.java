package OOPs.Abstraction;

abstract class Phone{
    abstract void call();
    void message(){
        System.out.println("Sending message");
    }
}
class SmartPhone extends Phone{
    @Override
    void call() {
        System.out.println("Calling from Smartphone");
    }
}
public class PartialAbstraction {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.call();
        p.message();
    }
}
