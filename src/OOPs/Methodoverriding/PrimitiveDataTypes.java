package OOPs.Methodoverriding;

class Parent11{
    int getNumber(){
        return 10;
    }
}
class Child11 extends Parent11{
    @Override
    int getNumber() {
        return 20;
    }
}

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Parent11 p = new Child11();
        System.out.println(p.getNumber());
    }
}
