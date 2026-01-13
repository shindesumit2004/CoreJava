package Practice;

class A{
    A show(){
        System.out.println("This from the class A");
        return new B();
    }
}

class B extends A{
    A show(){
        System.out.println("This is from the class B");
        return new A();
    }
}

public class Covarient {
    public static void main(String[] args) {

    }

}
