package mainVoo;
import flight.Flight;
import passenger.Passenger;
import reservation.Reservation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger(1,"Fulano","1234567890");
        Passenger passenger2 = new Passenger(2,"Ciclano","9876543210");

        Flight voo1 = new Flight(3,"Brasil","EUA");
        Flight voo2 = new Flight(4,"Portugal","França");

        Reservation reservado1 = new Reservation(5, LocalDate.of(2024,9,30),passenger1,voo1);
        Reservation reservado2= new Reservation(6,LocalDate.of(2024,12,25),passenger2,voo2);

        System.out.println(reservado1.toString());
        System.out.println(reservado2.toString());
    }
}