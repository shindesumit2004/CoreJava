package org.example.LinkedList;

import org.w3c.dom.Node;

public class CustomLinkedList {

    //head pointer
    // by default it is a null
    Node head;

    class Node{

        // Every node has its own data and nextpointer address
        // There are two field in this
        int data;
        Node nextPointer;

        //constructor for this Nodes class data (Parametrized constructor)

        Node(int data){
            this.data = data;
        }

        // getter and setter method


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNextPointer() {
            return nextPointer;
        }

        public void setNextPointer(Node nextPointer) {
            this.nextPointer = nextPointer;
        }
    }

    public void insert(int data){

        //first it check the head is null or not if head is then it add the data of next eleme
        if (head == null){
            head = new Node(data);
        }else {

            Node newNode = new Node(data);
            newNode.setNextPointer(head);
            head = newNode;
        }
    }

    // Insert at beginning
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.setNextPointer(head);
        head = newNode;
    }
    public void print(){ // method name(Print())
        Node curr = head;//curr -> temporary pointer used for traversal # head -> reference of the first node in the linked list
        while (curr != null){  // loop continues until the end of the list
                               // null means no next node
            System.out.println(curr.getData()+" "); // data of current node
            curr = curr.getNextPointer(); // Moves curr to the next node
        }

    }
}
