package Practice;

public class MethodOverload2 {

    public void overloaded(){

    }
    private void overloaded(int b){


    }
    protected int overloaded(int i, double d){
        System.out.println("The value is a :" + i + d);
        return 10;
    }


    public static void main(String[] args) {
        MethodOverload2 obj = new MethodOverload2();
        obj.overloaded(10,20.0);

    }
}
