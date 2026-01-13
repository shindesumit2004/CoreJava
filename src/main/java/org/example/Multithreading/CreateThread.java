package org.example.Multithreading;

public class CreateThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Task");
    }

    public static void main(String[] args) {
        CreateThread ct = new CreateThread();
        Thread th = new Thread(ct);
        th.start();

    }

}




