package org.example.Multithreading;

class Thread22 implements Runnable {

    public void run(){
        System.out.println("Execute the Run method");
    }

}

public class MyThread{
    public static void main(String[] args) {

        Thread22 t = new Thread22();
        Thread th = new Thread(t);
        th.start();
    }
}