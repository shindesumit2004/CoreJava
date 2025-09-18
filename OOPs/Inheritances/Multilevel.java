package OOPs.Inheritances;

class Grandparent{
    void property(){
        System.out.println("Grandparent Property");
    }
}
class Parent2 extends Grandparent{
    void house(){
        System.out.println("Parent Property");
    }
}
class Child3 extends Parent2{
    void bike(){
        System.out.println("Child bike");

    }
}
public class Multilevel {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.property();
        c.house();
        c.bike();
    }
}
