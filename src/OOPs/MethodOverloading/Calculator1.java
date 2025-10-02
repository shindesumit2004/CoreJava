package OOPs.MethodOverloading;

public class Calculator1 {
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        System.out.println("Sum (int) : " + c.add(10, 20));
        System.out.println("Sum (double) : " + c.add(5.5, 2.5));
        System.out.println("sum (3 int) : "+ c.add(1, 2, 3));
    }

}
