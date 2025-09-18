package basicprogram;

public class Leapyear {
    public static void main(String[] args){
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){

            System.out.println("This year is Leap year" + year );

        } else {
            System.out.println("This year is not Leap year" + year);
        }
    }
}
