package OOPs.Methodoverriding;

// Overriding across multiple levels

class GrandParent {
    void greet(){
        System.out.println("Hello from GrandParent");
    }
}
class Parent1 extends GrandParent{
    @Override
    void greet() {
        System.out.println("Hello from Parent");
    }
}
class Child1 extends Parent1{
    @Override
    void greet() {
        System.out.println("Hello From Parent");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        GrandParent obj = new Child1();
        obj.greet();
    }
}
