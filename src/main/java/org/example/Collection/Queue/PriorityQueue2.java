package org.example.Collection.Queue;

import java.util.*;

public class PriorityQueue2 {
    public static void main(String[] args) {

        PriorityQueue p = new PriorityQueue();
        System.out.println(p);

        for (int i=0; i<=10; i++){
            p.offer(i);
        }

        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
        System.out.println(p.remove());
        System.out.println(p);
        System.out.println(p.element());
        System.out.println(p);
    }

}
