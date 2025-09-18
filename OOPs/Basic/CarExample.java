package OOPs.Basic;

class Car {
    String brand;
    String color;
    int speed;

    void setCar(String b, String c, int s){
        brand = b;
        color = c;
        speed = s;

    }
    void showCar() {
        System.out.println("Brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("speed: " + speed + "km/h");
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCar("toyota", "Red", 120);
        car1.showCar();

        System.out.println();

        Car car2 = new Car();
        car2.setCar("Honda", "Black", 140);

        car2.showCar();
    }
}
