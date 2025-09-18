package OOPs.Interface;

public interface P1 {

    void show();

}
interface P2{

    void show();
}
class Test implements P1,P2{

    public void show(){

        System.out.println("1");
    }

   public void display(){
       System.out.println("2");
   }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }


}
