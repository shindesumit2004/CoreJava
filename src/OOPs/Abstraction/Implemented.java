package OOPs.Abstraction;

abstract class Bank{
    abstract int getRateOfInterest();
    void display(){
        System.out.println("Banking system");
    }
}
class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

public class Implemented {
    public static void main(String[] args) {

        Bank b = new SBI();
        b.display();
        System.out.println("ROI: " + b.getRateOfInterest());
    }
}
