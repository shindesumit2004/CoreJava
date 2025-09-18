package OOPs.Encapsulation;

class Car{

    String brand;
    int speed;

    void setDetails(String b, int s){
        brand = b;
        speed = s;

    }
    void printDetails(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}


public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.setDetails("Tata", 100);
        
    }
}
