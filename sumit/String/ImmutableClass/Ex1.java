package sumit.String.ImmutableClass;

final class A{

    private final String name;
    private final int age;

   public A(String name, int age){

       this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        A a = new A("Sumit",20);

        System.out.println("Name of Empolyee is : " +a.getName());
        System.out.println("Age of Empolyee is : " +a.getAge());
    }
}
