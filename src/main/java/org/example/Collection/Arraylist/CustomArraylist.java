package org.example.Collection.Arraylist;

import java.util.ArrayList;

class Empolyee1{
    int eid;
    String name;
    int age;

    public Empolyee1(int eid, String name, int age){
        super();
        this.eid = eid;
        this.name = name;
        this.age = age;
    }


}

public class CustomArraylist {
    public static void main(String[] args) {
        Empolyee1 e1 = new Empolyee1(101, "Yash", 29);
        Empolyee1 e2 = new Empolyee1(102,"Sanju", 21);
        Empolyee1 e3 = new Empolyee1(103, "Manju", 29);

        ArrayList<Empolyee1> ei = new ArrayList<Empolyee1>();

        ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();

        ei.add(e1);
        ei.add(e2);
        ei.add(e3);

        list.add(e1);
        System.out.println(list);
        list.display();

        for ( Empolyee1 e :ei){
            System.out.println(e.eid+" "+e.name+" "+e.age);
        }




    }
}
