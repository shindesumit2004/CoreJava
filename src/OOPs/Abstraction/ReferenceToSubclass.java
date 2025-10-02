package OOPs.Abstraction;

abstract class Animal12{
    abstract void eat();
}
class Lion extends Animal12{
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }
}
class Cow extends Animal12{
    @Override
    void eat() {
        System.out.println("Cow eats grass");
    }
}
public class ReferenceToSubclass {
    public static void main(String[] args) {
        Animal12 a = new Lion();
        Animal12 b = new Cow();
        a.eat();
        b.eat();
    }
}
