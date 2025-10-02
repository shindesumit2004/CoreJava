package OOPs.Methodoverriding;

class Parent12{
    protected void show(){
        System.out.println("Parent show()");
    }
}

class Child12 extends Parent12{
    public void show(){
        System.out.println("Child Show()");
    }
}


public class AMValid {
    public static void main(String[] args) {
        Parent12 p = new Child12();
        p.show();
    }

}
