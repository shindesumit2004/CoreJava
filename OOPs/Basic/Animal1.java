package OOPs.Basic;

public class Animal1 {
    void eat(){
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        System.out.println("1");

        Animal cat = new Animal();
        cat.run();
        cat.run();
       
    }
    void run (){
        System.out.println("I am running");

    }

}
