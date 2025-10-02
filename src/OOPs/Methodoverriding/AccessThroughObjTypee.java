package OOPs.Methodoverriding;

class Parent34 {
    private void secret() {
        System.out.println("Parent secret()");
    }

    public void callSecret() {
        secret();
    }
}

class Child34 extends Parent34{
    public void secret(){
        System.out.println("Child secret()");
    }
}
 public class AccessThroughObjTypee {
     public static void main(String[] args) {
         Child34 c = new Child34(); //Output : Child secret
         c.secret();
     }
}

