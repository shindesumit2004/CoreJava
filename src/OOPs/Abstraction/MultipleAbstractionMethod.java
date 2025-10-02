package OOPs.Abstraction;

abstract class Calculator{
    abstract int add(int a, int b);
    abstract int multiply(int a, int b);
}

class MyCalc extends Calculator{
    @Override
    int add(int a, int b) {
         return a + b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }
}
public class MultipleAbstractionMethod {
    public static void main(String[] args) {
        Calculator c = new MyCalc();
        System.out.println("Sum = " + c.add(5, 3));
        System.out.println("Multiply =" + c.multiply(5, 3));
    }
}
