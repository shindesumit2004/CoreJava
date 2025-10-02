package OOPs.Static;

class Student{
    int rollNo;
    String name;
    static String college = "Deogiri college, Chhtrapati Sambhajinager ";

    Student(int r, String n){
        rollNo = r;
        name = n;
    }
    void display(){
        System.out.println(rollNo + " " + name );
        System.out.println("---------------------------------");
        System.out.println(college);

    }
}

public class StaticVariable {

    public static void main(String[] args) {
        Student s1 = new Student(101, "sumit");
        Student s2 = new Student(102, "Ravi");

        s1.display();
        s2.display();

    }

}
