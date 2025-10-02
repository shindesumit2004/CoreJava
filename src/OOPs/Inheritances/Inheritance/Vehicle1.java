package OOPs.Inheritances.Inheritance;

class vehicle{
    void start(){
        System.out.println("Vehicle start");
    }
}

public class Vehicle1 extends vehicle{
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.start();
    }
}
