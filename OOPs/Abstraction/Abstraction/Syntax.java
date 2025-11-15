package OOPs.Abstraction.Abstraction;

abstract class Abc{

    abstract void run();


}
class Ab extends Abc{
    void run(){
        System.out.println("Car is run");
    }
}

public class Syntax  {
    public static void main(String[] args) {

        Ab obj = new Ab();
        obj.run();

    }
}
