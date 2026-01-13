package org.example.Multithreading;

class BookMovieSeat{
    int total_seats=10;

    void bookSeat(int seats, String name){
        if (total_seats>=seats){
            System.out.println(name+" booked "+seats+"seats successfully");
            total_seats=total_seats-seats;
            System.out.println("Total seats left : "+total_seats);
        }
        else {

        }
    }
}

public class MovieBookingApp {
}
