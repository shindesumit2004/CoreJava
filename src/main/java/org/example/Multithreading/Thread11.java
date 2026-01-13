package org.example.Multithreading;

public class Thread11 extends Thread {
    @Override
    public void run() {
        System.out.println("The thread working is a good");
    }

    public static void main(String[] args) {

        Thread11 t = new Thread11();
        t.start();

    }
}
