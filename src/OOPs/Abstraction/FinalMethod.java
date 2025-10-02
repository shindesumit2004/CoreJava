package OOPs.Abstraction;

abstract class Device{
    abstract void powerOn();
    final void company(){
        System.out.println("Company : Samsung");
    }
}

class TV extends Device{
    @Override
    void powerOn() {
        System.out.println("Tv powered on");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Device d = new TV();
        d.company();
        d.powerOn();
    }
}
