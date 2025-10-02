package OOPs.Methodoverriding;

class Parent55{
    static void display(){
        System.out.println("Parent static display()");
    }
}
class Child55 extends Parent55{
    static void display(){
        System.out.println("Child static display()");
    }
}

public class CallingWithClassName {
    public static void main(String[] args) {
        Parent55.display();
        Child55.display();
    }
}
