package OOPs.Methodoverriding;

class Pa{
    final void finalMethod(){
        System.out.println("Parent finalMethod()");
    }
    static void staticMethod(){
        System.out.println("Parent staticMethod()");
    }
    private void PrivateMethod(){
        System.out.println("Parent PrivateMethod()");
    }
}

public class FinalStaticPrivate {

    // cannot override final method
    // cannot override  private method
    // cannot override static only hide method
}
