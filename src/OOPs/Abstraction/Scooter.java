package OOPs.Abstraction;

class Car{
    int no_of_tyres = 4;
    void displayTyres(){
        System.out.println("No of tyres : "+no_of_tyres);
    }
    void start(){
        System.out.println("Starts with key");
    }
}

public class Scooter {
    int no_of_tyres = 2;
    void displayTyres(){
        System.out.println("no_of_tyres : " +no_of_tyres);
    }
    void start(){
        System.out.println("Start with kicks");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.displayTyres();
        car.start();

        System.out.println();

        Scooter scooter = new Scooter();
        scooter.displayTyres();
        scooter.start();
    }
}
