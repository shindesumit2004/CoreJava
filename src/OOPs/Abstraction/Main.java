package OOPs.Abstraction;
abstract class Vehicle{
    int no_of_tyres;

    void displayTyres(){
        System.out.println("This vehicle has" + no_of_tyres + "Tyres.");
    }
    abstract void start();
}

class Car2 extends Vehicle{
    Car2(){
        no_of_tyres = 4;
    }

    @Override
    void start() {
        System.out.println("Car starts with key ignition.");
    }
}
class Scooter1 extends Vehicle{

    Scooter1(){
        no_of_tyres = 2;

    }

    @Override
    void start() {
        System.out.println("Scooter starts with kick or ignition");

    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle myVehicle1 = new Car2();
        myVehicle1.displayTyres();
        myVehicle1.start();

        System.out.println();

        Vehicle myVehicle2 = new Scooter1();
        myVehicle2.displayTyres();
        myVehicle2.start();
    }
}
