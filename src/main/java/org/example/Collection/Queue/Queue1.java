package org.example.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        System.out.println(q.peek());
        System.out.println(q.offer(10));
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q);


    }
}
