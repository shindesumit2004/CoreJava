package org.example.ExceptionHandling;

public class Unchecked {
    public static void main(String[] args) {

        int[] a = {10,20,30};
        try {
            System.out.println(a[6]);//ArrayIndexOutOfBoundsException : 6
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Executed Catch Block");
            e.printStackTrace();
        }
        System.out.println("Run Successfully");
    }
}
