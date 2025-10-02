package OOPs.Inheritances;


class Animal2{
    void eat(){
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal2{
    void bark(){
        System.out.println("Dogs barks");
    }
}
class Cat extends Animal2{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class Herarichical {
    public static void main(String[] args) {
        Dog c = new Dog();
        c.eat();
        c.bark();
        Cat d = new Cat();
        d.eat();
        d.meow();
    }
    
}
