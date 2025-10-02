package OOPs.Interface;

interface I1{
    void m1();
}
interface I2{
    void m2();
}

class A implements I1, I2{
    @Override
    public void m1() {
        System.out.println("Method m1 from interface I1");
    }

    @Override
    public void m2() {
        System.out.println("Method m2 from interface I2");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        obj.m2();
    }
}
