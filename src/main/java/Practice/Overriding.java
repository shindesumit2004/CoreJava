package Practice;

class Parent{

    void methodOfSuperClass(){
        System.out.println("From Super Class");
    }
}

class SubClass extends Parent{
    @Override
    void methodOfSuperClass() {
        System.out.println("From the child class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.methodOfSuperClass();
        SubClass subClass = new SubClass();
      //  SubClass.methodOfSuperClass();
    }

}
