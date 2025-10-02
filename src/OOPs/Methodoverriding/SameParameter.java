package OOPs.Methodoverriding;
class Animal extends Animal3 {
    void sound(int times){
        System.out.println("Animal sound " + times + "times");
    }
}
class Dog extends Animal{
    @Override
    void sound(int times) {
        System.out.println("Dog barks " + times + "times");
    }
}
public class SameParameter {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(3);
    }
}
