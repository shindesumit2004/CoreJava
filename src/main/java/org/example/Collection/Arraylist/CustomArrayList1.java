package org.example.Collection.Arraylist;
import javax.management.ObjectName;
import java.lang.Object;
import java.util.Arrays;

class ArrayListCustom<E>{
    private static final int INITIAL_CAPACITY= 10;
    private int size = 0;
    private Object elementData[] = {};

    public ArrayListCustom(){
        elementData = new Object[INITIAL_CAPACITY];
    }

    public void add(Object e){
        if (size==elementData.length){
            ensureCapacity(); // Increase current capacity of list, make it double.
        }
        elementData[size++]=e;
    }

    public E get(int index){
        // if index is negative or greater than size of size, we throw
        // Exception

        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index :"+ index + ",Size" + index);

        }
        return (E) elementData[index]; // return value of index.
    }

    public Object remove(int index){
        // if index negative or greater than size of size , we throw
        //Exception

        if (index <= 0 || index >= size){
            throw new IndexOutOfBoundsException("index; " + index+ ", Size" + index);
        }
        Object removeElement = elementData[index];
        for (int i = index; i < size - 1; i++){
            elementData[i] = elementData[i+1];

        }
        size--; //reduce size of ArrayListCustom after removal of element

        return removeElement;

    }

    private void ensureCapacity(){
        int newIncreaseCapacity = elementData.length*2;
        elementData = Arrays.copyOf(elementData,newIncreaseCapacity);
    }

    /*
    Display custom / your own ArrayList

    Method displays all the elements in list.
     */


public void display() {
    System.out.println("Displaying list : ");
    for (int i = 0; i < size; i++) {
        System.out.println(elementData[i] + " ");
    }
  }
}
/*
* Main class to test ArrayListCustom Functionality
* */

public class CustomArrayList1 {
    public static void main(String[] args) {

        ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
        // Add element in custom ArrayList

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);


        // Display custom ArrayList
        list.display();
        System.out.println("\n element at index in custom Arraylist>"+1+"="+list.get(1));

        System.out.println("Element removed from index"+1+"="
        +list.remove(1));

        System.out.println("\n let's display custom Arraylist again after removal at index 1");

        list.display();

    }
}
