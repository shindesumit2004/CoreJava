package OOPs.Abstraction.Abstraction;
abstract class E{

    abstract void eat();

    void eating(){
        System.out.println("The Dog is eating a food");
    }
}

class C extends E{

    @Override
    void eat() {
        System.out.println("Animal is eating");
    }
}
public class Ex1 {
    public static void main(String[] args) {

        C c = new C();
        c.eat();
        c.eating();
    }
}
