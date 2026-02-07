package org.example.ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        try {
            File file = new File("Example.txt");
            FileReader fr = new FileReader(file); //May throw exception
            System.out.println("File Opened successfully.");
            fr.close();
        }catch (IOException e){
            System.out.println("An IoException occurred :"+e.getMessage());
        }
    }
}
