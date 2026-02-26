package org.example.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeRegex {

    public static void checkStringAgainRE(String re, String str){
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.matches();
        System.out.println(matches);

    }
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter regular Expression");
            Scanner scanner = new Scanner(System.in);
            String re = scanner.nextLine();
            System.out.println("Enter your string");
            String str = scanner.nextLine();

            checkStringAgainRE(re, str);
            System.out.println();

            System.out.println("Want to exit [Y/N]");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Thank you for use app");
                break;
            }
        }
    }
}

/*
 # Matching UserName that contain numbers, letter, and @, $ only.

 ^[a-zA-z0-9@$]+$  => Using this regex you can make the username regex.


 # create regex for Email

 ^[a-zA-Z0-9_.$_]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$

# create currency regex

^₹\s?\d{1,3}(,\d{2,3})*(\.\d{2})?$

suppose you provide
100.00

^\d+\.\d{2}$
 */

