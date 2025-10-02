package OOPs.Static;

import java.util.SortedMap;

class Student2 {
    int rollNo;
    String name;
    static String collegeName = "DCCS";
    static String departmentName = "Computer Science";
    static String teacher = "XYZ";

    Student2(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(collegeName);
        System.out.println(departmentName);
        System.out.println(teacher);
    }

}

public class Department {
    public static void main(String[] args) {
        Student2 s1 = new Student2(102 , "sumit");

        Student2 s2 = new Student2(103, "Chandrakant");

        Student2 s3 = new Student2(104, "Manish");

        Student2 s4 = new Student2(105 , "Sopan");



        s1.display();
        System.out.println("------------------------------------------------------");

        s2.display();
        System.out.println("------------------------------------------------------");


        s3.display();
        System.out.println("------------------------------------------------------");

        s4.display();
        System.out.println("------------------------------------------------------");

    }


}
