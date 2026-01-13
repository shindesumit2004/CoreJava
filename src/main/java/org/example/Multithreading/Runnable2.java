package org.example.Multithreading;

public class Runnable2 implements Runnable{
    public void run(){
        System.out.println("The task is working good by its");
    }

    public static void main(String[] args) {
        Runnable2 r = new Runnable2();
        Thread t = new Thread(r);
        t.start();
    }
}
