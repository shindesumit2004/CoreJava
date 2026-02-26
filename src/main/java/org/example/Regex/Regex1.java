package org.example.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {

//        String regex = "a";
       Pattern pattern = Pattern.compile("aa");

       Matcher matcher = pattern.matcher("a");

       boolean matches = matcher.matches();

        System.out.println("result : "+ matches);


    }
}
