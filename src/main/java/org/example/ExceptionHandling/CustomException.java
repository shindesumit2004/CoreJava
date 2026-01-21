package org.example.ExceptionHandling;
/*
class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}*/


class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {

    static void validate(int age) throws InvalidAgeException{

        if (age < 18){
            throw new InvalidAgeException("Age is not eligible to vote ");
        }else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {

        try {
            validate(13);
        }catch (InvalidAgeException ex){
            ex.printStackTrace();
        }
        System.out.println("Rest the code...!");
    }

/*


    static void validate(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Age is eligible to vote");
        }else {
            System.out.println("Welcome to vote");
        }

    }

    public static void main(String[] args) {
        try {
            validate(13);
        }catch (InvalidAgeException ex){
            System.out.println("you are not eligible for vote");
            System.out.println(ex);
        }

        System.out.println("Rest to the code");
    }

 */
}
