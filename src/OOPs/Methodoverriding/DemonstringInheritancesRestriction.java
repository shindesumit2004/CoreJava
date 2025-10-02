package OOPs.Methodoverriding;
abstract class Parent111{
    void greet1(){
        System.out.println("Hello from Parent");
    }

    abstract void greet();
}
class Child111 extends Parent111{
    @Override
    public void greet1(){
        super.greet1();
        System.out.println("Hello from Child");
    }

    @Override
    void greet() {
        this.greet1();

        System.out.println("Abstract overrided method");
    }
}
public class DemonstringInheritancesRestriction {
    public static void main(String[] args) {
        Child111 c = new Child111();
        c.greet();


    }

}
