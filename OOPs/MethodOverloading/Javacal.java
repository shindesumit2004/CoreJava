package OOPs.MethodOverloading;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Javacal {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();

        int result1 = calc.add(10, 20);
        double result2 = calc.add(5.5, 4.5);
        int result3 = calc.add(1, 2, 3);

        System.out.println("Result of add(int, int): " + result1);
        System.out.println("Result of add(double, double): " + result2);
        System.out.println("Result of add(int, int, int): " + result3);
    }

}
