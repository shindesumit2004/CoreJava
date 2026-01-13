package org.example.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        q.offer(10);
        q.offer(30);
        q.offer(54);
        q.offer(50);
        q.offer(60);
        q.offer(70);
        q.offer(80);
        System.out.println(q);

      //  q.clear();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.poll());

        System.out.println(q);
    }
}
