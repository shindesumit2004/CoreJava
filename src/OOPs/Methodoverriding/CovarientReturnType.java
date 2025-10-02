package OOPs.Methodoverriding;

class Animal3{
    Animal getAnimal3(){
        return new Animal();
    }
}
class Dog3 extends Animal3{
    Dog getAnimal3(){
        return new Dog();
    }
}

public class CovarientReturnType {
    public static void main(String[] args) {
        Animal3 obj = new Dog3();
      Animal3 result = obj.getAnimal3();

        System.out.println(result.getClass().getSimpleName());
    }
}
