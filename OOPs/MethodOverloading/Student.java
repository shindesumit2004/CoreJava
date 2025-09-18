package OOPs.MethodOverloading;

public class Student {
    int id ;
    String name;

    Student(){
        System.out.println("Default Constructor Called");
    }
    Student(int i, String n){
        id = i;
        name = n;
        System.out.println("ID: " + id + ", name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "sumit");
    }
}
