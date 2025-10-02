package OOPs.Inheritances;

class Parent5{
    Parent5(){
        System.out.println("Parent Constructor");
    }
}
class Child5 extends Parent5{
    Child5(){
        System.out.println("Child Constructor");
    }
}
public class Constructor {
    public static void main(String[] args) {
        new Child5();
    }
}
