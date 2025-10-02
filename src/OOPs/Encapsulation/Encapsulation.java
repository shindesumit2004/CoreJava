package OOPs.Encapsulation;

class Car0{
    String brand ;
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

public class Encapsulation {
    public static void main(String[] args) {
        Car0 c = new Car0();
        c.setDetails("Tata", 100);
        c.printDetails();
    }
}
