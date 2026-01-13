package org.example.Collection.Comparable;

import java.util.*;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student st){
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;

    }

}

public class Comparable2 {
    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101,"peter",23));
        al.add(new Student(106,"Andrew",27));
        al.add(new Student(105, "John", 21));

        for (Student st : al){
            System.out.println(st.rollno+" " +st.name+" "+ st.age);
        }
    }

}
