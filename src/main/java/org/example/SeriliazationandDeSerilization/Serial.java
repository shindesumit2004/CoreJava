package org.example.SeriliazationandDeSerilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

    public static void main(String[] args) {


        // Create object of student
        try {
            Student11 student11 = new Student11("Ankit kumar tiwari", "ankit@gmail.com", 20, "Pune");

            FileOutputStream fos = new FileOutputStream("ob.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //How to serialize

            oos.writeObject(student11);

            oos.close();
            oos.close();

            System.out.println("Object stated is transfered to file ob !!");
        }
        catch (IOException exception){
            exception.printStackTrace(  );
        }

    }


}
