package OOPs.Abstraction;

abstract class Animal11{
    abstract void sound();
}
abstract class WildAnimal extends Animal11{
    abstract void habitat();
}
class Tiger extends WildAnimal{
    @Override
    void sound() {
        System.out.println("Tiger roars");
    }

    @Override
    void habitat() {
        System.out.println("Lives in jungle");
    }
}

public class InheritanceChain {
    public static void main(String[] args) {
        WildAnimal w = new Tiger();
        w.sound();
        w.habitat();
    }
}
