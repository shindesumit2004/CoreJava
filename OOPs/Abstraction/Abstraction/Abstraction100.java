package OOPs.Abstraction.Abstraction;

interface Vechicle{

    void start();
    void stop();

}

class Car implements Vechicle{
    public void start(){
        System.out.println("Car is Starting.....");
    }

   public void stop(){
        System.out.println("Car is Stopping......");
    }
}

public class Abstraction100 {
}
