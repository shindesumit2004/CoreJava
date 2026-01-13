package Practice;

class Animal{

}
class Dog extends Animal{

}
class Parent1{
    Animal getAnimal(){
        return new Animal();
    }
}
class Child extends Parent1{
    Dog getAnimal(){
        return new Dog();
    }
}
public class Covarient3{
    public static void main(String[] args) {


    }
}
