package OOPs.Abstraction;
// Without Abstraction

class Car4{
    int no_of_tyres = 4;
    void displayTyres(){
        System.out.println("No of tyres : " + no_of_tyres);
    }

    void start(){
        System.out.println("Start with key");
    }
}

class Scooter2{
    int no_of_tyres = 2;
    void displayTyres(){
        System.out.println("no_of_tyres" + no_of_tyres);
    }
    void start(){
        System.out.println("Start with kicks");
    }

    public static void main(String[] args) {
        Car4 car = new Car4();
        car.displayTyres();
        car.start();

        System.out.println();

        Scooter2 scooter = new Scooter2();
        scooter.displayTyres();
        scooter.start();

    }
}
public class Main2 {
}
