package OOPs.Methodoverriding;

//Not possible in the same class

public class Test2 {
    void display(){
        System.out.println("Hello");
    }


    void display(int x){
        System.out.println("Hi " + x);
    }
}
