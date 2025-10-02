package OOPs.Methodoverriding;

class Parent16{
    void greet(){
        System.out.println("Hello from Parent");
    }
}
class Child15 extends Parent16{
    protected void greet(){
        System.out.println("Hello from child");
    }
}


public class DPP {
    public static void main(String[] args) {
        Parent16 p = new Child15();
        p.greet();
    }
}
