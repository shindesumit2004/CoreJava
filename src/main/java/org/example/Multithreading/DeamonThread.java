package org.example.Multithreading;

public class DeamonThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread");

    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
       // Thread.currentThread().setDaemon(true);
        DeamonThread t = new DeamonThread();
        t.setDaemon(true);
        t.start();
    }
}
