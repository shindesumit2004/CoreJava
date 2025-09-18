
package OOPs.Inheritances.Inheritance;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");

    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }

}

class Cow extends Animal{
    void sound(){
        System.out.println("Cow moos");
    }
}


public class Inheritance2 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new cat();
        a.sound();

        a = new Cow();
        a.sound();

    }
}
