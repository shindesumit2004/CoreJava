package org.example.Multithreading;



public class SingleTaskFormSingleThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread task");
    }



    public static void main(String[] args) {

        SingleTaskFormSingleThread s = new SingleTaskFormSingleThread();
        s.start();

//        SingleTaskFormSingleThread s2 = new SingleTaskFormSingleThread();
//        s2.start();
    }
}

