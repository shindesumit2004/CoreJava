package org.example.Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentDetails1{
    private int id;
    private int rollNum;
    private String fName;
    private String IName;
    private double salary;

    private StudentDetails1(){

    }

    public StudentDetails1(int id, int rollNum, String fName, String IName, double salary){
        this.id = id;
        this.rollNum = rollNum;
        this.fName = fName;
        this.IName = IName;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getIName() {
        return IName;
    }

    public void setIName(String IName) {
        this.IName = IName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", rollNum=" + rollNum +
                ", fName='" + fName + '\'' +
                ", IName='" + IName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class FName1 implements Comparator<StudentDetails>{

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getfName().compareTo(o2.getfName());
    }
}
class RollNo1 implements Comparator<StudentDetails>{

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getRollNum() - (o2.getRollNum());
    }
}
public class Comparator2 {
    public static void main(String[] args) {
        StudentDetails s11 = new StudentDetails(102, 2, "Sumit", "Shinde", 100000);
        StudentDetails s12 = new StudentDetails(104, 1, "Avinash", "Surwase", 90000);
        StudentDetails s13 = new StudentDetails(111, 4, "Ajit", "Biradar", 95000);
        StudentDetails s14 = new StudentDetails(106, 3, "Narsing", "Patil", 91000);
        StudentDetails s15 = new StudentDetails(101, 5, "Bharat", "Karle", 92000);
        StudentDetails s16 = new StudentDetails(105, 6, "Dhananjay", "Shinde", 99000);
        StudentDetails s17 = new StudentDetails(103, 8, "Saurabh", "Shinde", 98000);
        StudentDetails s18 = new StudentDetails(110, 7, "kapil", "Zute", 97000);
        StudentDetails s19 = new StudentDetails(107, 10, "Chandrakant", "Khetri", 80000);
        StudentDetails s20 = new StudentDetails(108, 9, "Sopan", "Kute", 960000);
        StudentDetails s21 = new StudentDetails(109, 11, "Angad", "Raut", 71000);


        List<StudentDetails> studentDetails = new ArrayList<>();

        studentDetails.add(s11);
        studentDetails.add(s12);
        studentDetails.add(s13);
        studentDetails.add(s14);
        studentDetails.add(s15);
        studentDetails.add(s16);
        studentDetails.add(s17);
        studentDetails.add(s18);
        studentDetails.add(s19);
        studentDetails.add(s20);
        studentDetails.add(s21);

        System.out.println("List before sorting : "+ studentDetails );

//        FName fName = new FName();
//
//        Collections.sort(studentDetails, fName);
//
//        System.out.println("List After sorting : "+ studentDetails);
//
//        RollNo rollNo = new RollNo();
//
//        Collections.sort(studentDetails, rollNo);
//
//        System.out.println("List After sorting : "+studentDetails);

        Comparator<StudentDetails> idComparator = new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                return o1.getId() - o2.getId();
            }
        };

        Collections.sort(studentDetails, idComparator);
        System.out.println("After sorting using id  "+studentDetails);



    }
}
