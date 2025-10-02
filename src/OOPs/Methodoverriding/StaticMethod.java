package OOPs.Methodoverriding;

class Parent44{
    static void show(){
        System.out.println("Parent static show()");
    }
}

class Child44 extends Parent44{
    static void show(){  //method hiding, not overriding
        System.out.println("Child static show");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Parent44 p = new Child44();
        p.show();
    }
}
