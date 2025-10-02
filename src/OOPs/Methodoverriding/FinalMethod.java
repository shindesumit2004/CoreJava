package OOPs.Methodoverriding;

class Parent22{
    public final void show(){
        System.out.println("Parent final show()");
    }
}
class Child22 extends Parent22{
    // compile time error
}

public class FinalMethod {
    public static void main(String[] args) {
        Parent22 p = new Child22();
        p.show();
    }
}
