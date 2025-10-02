package OOPs.Methodoverriding;
class Parent3{
    void display(int x){
        System.out.println("Parent : "+ x);
    }
}

class Child3 extends Parent3{

    void display(String msg) {
        System.out.println("Child: " + msg);
    }
}
public class DifferentParameter {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.display(100);
        c.display("Hello");
    }
}
