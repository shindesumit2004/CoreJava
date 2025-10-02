package OOPs.Abstraction;

abstract class Animal{
    abstract void show();
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog barks");
    }

    @Override
    void show() {
        System.out.println("Dog silent");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
        a.show();
    }
}
