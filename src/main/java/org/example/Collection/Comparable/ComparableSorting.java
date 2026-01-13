package org.example.Collection.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    Employee() {
    }

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    /*
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
*/

    public String toString(){
        return "Employee { " +
                "id=" + id +
                ", firstName= ' " + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getfirstName().compareTo(o.getfirstName());
    }
}

public class ComparableSorting {
    public static void main(String[] args) {

        Employee avinash = new Employee(102, "Avinash","Surwase",98000);
        Employee sumit = new Employee(101, "Sumit","Shinde",90000);
        Employee sarita = new Employee(104, "Sarita","Kadam", 100000);
        Employee ajit = new Employee(103,"Ajit","Biradar",950000);
        Employee aagad = new Employee(105,"Aagad", "Raut",160000);

        List<Employee> list = new ArrayList<Employee>();
        list.add(avinash);
        list.add(sumit);
        list.add(sarita);
        list.add(ajit);
        list.add(aagad);

        System.out.println("Before Sorting : " + list);

        Collections.sort(list);

        System.out.println("After Sorting : " + list);


    }

}
