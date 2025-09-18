package OOPs.Inheritances;

class Parent1{
    void display(){
        System.out.println("This is parent class");
    }

}
class Child1 extends Parent1{
    void show(){
        System.out.println("This is child class");
    }
}
public class Main1 {
    public static void main(String[] args){
        Child1 c = new Child1();
        c.show();
        c.display();

    }
}
