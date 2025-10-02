package OOPs.Inheritances;
class A{

    void m1(){
        System.out.println("m1 in class A");
    }

}
class B1 extends A{
    void m1(){
        System.out.println("m1 in class B");
    }
}
class C extends B1{
    void m1(){
        System.out.println("m1 in class c");
    }
}

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
