package OOPs.Inheritances;
class Parent6{
    void display(){
        System.out.println("This is a parent");
    }
}
class Child6 extends Parent6{
    void display(){
        super.display();
        System.out.println("This is a child class");

    }
}
public class Superkeyword{
    public static void main(String[] args){
        new Child6().display();

    }

}
