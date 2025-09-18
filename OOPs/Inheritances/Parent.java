package OOPs.Inheritances;

public class Parent {
    int i;

    Parent(int i){

        System.out.println(i);
        this.i=i;
    }
    Parent(){



        System.out.println("Constructor Parent ");
    }
}
class Child extends Parent{
    int j;

    Child(){

        super(10);
    }

    public static void main(String[] args) {

        Parent obj = new Parent();

    }

}
