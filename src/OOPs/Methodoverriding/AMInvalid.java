package OOPs.Methodoverriding;

class Parent14{
    public void display(){
        System.out.println("Parent display()");
    }
}

class Child14 extends Parent14{
    @Override
    public void display() {
        System.out.println("Child display()");
    }
    // Compile-time error: Cannot reduce visibility
    // Protected void display(){
    // sout("child disply();")
//}


public class AMInvalid {
    public static void main(String[] args) {

    }
}
}
