package OOPs.Methodoverriding;

class Parent33{
    public final void display(){
        System.out.println("Parent final display()");
    }
}
class Child33 extends Parent33{
    public void anotherMethod(){
        System.out.println("Child anotherMethod()");
    }
}

public class Diffname {
    public static void main(String[] args) {
        Child33 c = new Child33();
        c.display();
    }

}
