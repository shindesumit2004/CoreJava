package OOPs.Inheritances.Inheritance;
class Vehicle3{
    void start()
    {
        System.out.println("Vehicle Start");
    }
}
class Car extends Vehicle3{

    void drive()
    {
        System.out.println("Car Drives.");
    }

}


public class Inheritance {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.start();
        mycar.drive();
    }
}
