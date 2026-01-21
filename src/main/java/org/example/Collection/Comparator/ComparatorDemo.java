package org.example.Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator{
    private String name;
    private int id;
    private int age;

    public EmployeeComparator(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeComparator{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

class SortComparator implements Comparator<EmployeeComparator> {
    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

       EmployeeComparator sopan = new EmployeeComparator("Sopan", 2, 22);
       EmployeeComparator aagad = new EmployeeComparator("Aagad", 1, 25);
       EmployeeComparator chandrakant = new EmployeeComparator("Chandrakant", 4, 20);
       EmployeeComparator sumit = new EmployeeComparator("Sumit", 3, 21);




       List<EmployeeComparator> list = new ArrayList<>();
        list.add(sopan);
        list.add(aagad);
        list.add(chandrakant);
        list.add(sumit);

        SortComparator sc = new SortComparator();
        Collections.sort(list, sc);
        System.out.println(list);



        Comparator<EmployeeComparator> ec = new Comparator<EmployeeComparator>() {
            @Override
            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
                return o1.getId() - o2.getId();
            }
        };

//       Collections.sort(EmployeeComparator);
    }
}

