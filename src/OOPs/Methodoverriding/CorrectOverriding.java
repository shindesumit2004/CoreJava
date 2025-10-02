package OOPs.Methodoverriding;
class Parent2{
    void show(String msg){
        System.out.println("Parent : " + msg);
    }
}

class Child2 extends  Parent2{
    @Override
    void show(String msg) {
        System.out.println("Child : " + msg);
    }
}

public class CorrectOverriding {
    public static void main(String[] args) {
        Parent2 obj = new Child2();
        obj.show("Hello");
    }
}
