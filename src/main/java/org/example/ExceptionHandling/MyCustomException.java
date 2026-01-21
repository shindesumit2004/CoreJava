package org.example.ExceptionHandling;

class MyCustomException2 extends Exception{

}

public class MyCustomException {
    public static void main(String[] args) {

        try{
            throw new MyCustomException2();
        }catch (MyCustomException2 ex2){
            System.out.println("The is my custom exception");
            System.out.println(ex2.getMessage());
        }

        System.out.println("Program is run successfully.");
    }

}


