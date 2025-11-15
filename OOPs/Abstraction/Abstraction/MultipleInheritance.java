package OOPs.Abstraction.Abstraction;

interface Clock{

    void showTime();

}

interface Bluetooth{

    void connect();
}

class SmartWatch implements Clock,Bluetooth{

    @Override
    public void showTime() {
        System.out.println("Watch is showing a time. ");
    }

    @Override
    public void connect() {
        System.out.println("Bluetooth is connect to the mobile. ");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        SmartWatch s = new SmartWatch();
        s.connect();
        s.showTime();
    }

}
