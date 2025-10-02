package OOPs.Methodoverriding;

// A method can only be overridden in a Subclass(Parent-Child relation, but not in same class)

class Parent{
    void show(){
        System.out.println("Parent show()");
    }
}
class Child extends Parent{
    @Override
    void show() {
        System.out.println("Child Show()");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }

}
