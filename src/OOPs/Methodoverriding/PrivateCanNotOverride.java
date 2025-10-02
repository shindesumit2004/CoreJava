package OOPs.Methodoverriding;

class Parent77{
    private void show(){
        System.out.println(" Parent Private show()");
    }
    public void callShow(){
        show();
    }
}

class Child77 extends Parent77{
    // this is not overriding, this is new method

    public void show(){
        System.out.println("Child public show()");
    }
}

public class PrivateCanNotOverride {
    public static void main(String[] args) {
        Parent77 p = new Child77();
        p.callShow();
    }
}
