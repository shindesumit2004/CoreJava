package OOPs.Inheritances;

public class A1 {
    int i;

    A1(int i){
        this.i=i;
        System.out.println(i);
    }

    A1(){
        System.out.println("Class A Constructor");
    }
}

class B extends A1{
    int j;

    public B(){

        super(10);

        System.out.println("Class B Constructor");
    }

    public static void main(String[] args) {

        B obj = new B();

        A1 obj1 = new A1();

    }
}