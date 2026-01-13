package Practice;

class SuperClass{
    protected void methodOfSuperClass(){
        System.out.println("From the Super Class");
    }
}
class SubClass2 extends SuperClass{
    public void methodOfSuperClass(){
        System.out.println("From the Sub Class");
    }
}

public class AccessModifier {
}
