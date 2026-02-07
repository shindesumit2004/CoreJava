package org.example.SeriliazationandDeSerilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student11 student11 = (Student11) ois.readObject();
            student11.display();

        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}
