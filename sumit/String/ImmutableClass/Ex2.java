package sumit.String.ImmutableClass;

final class B{
    private final String name;
    private final int age;

    public B(String name, int age){
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

public class Ex2 {
    public static void main(String[] args) {
        B obj = new B("sumit", 20);

        System.out.println("The name of emp is a :" +obj.getName());
        System.out.println("The age of emp is a :" +obj.getAge());

    }
}
