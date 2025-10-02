package OOPs.MethodOverloading;

 class Parent{
    int add(int a, int b){
        return a + b;
    }
}
public class Intro extends Parent{
    public static void main(String[] args) {

    }

    @Override
    int add(int a, int b){
        return a + b;

    }
}

