package org.example.Multithreading;
/*
class Buffer1{
    int item;
    boolean produced = false;

    synchronized void produce(int value){
        if (produced){
            try{
                wait();
            }catch (Exception e){

            }
        }
        System.out.println("Consumed: " + item);

        produced = false;
        notify();
    }

}

class Consumer extends Thread{
    Buffer buffer;

    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        for (int i = 1; i <= 5; i++){
            buffer.pro
        }
    }
}

public class Buffer {
}
*/