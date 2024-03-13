import java.time.LocalDate;

public class Reservation {
    private int id;
    private LocalDate date;
    Passenger passenger;
    Flight flight;

    public Reservation(){
    }
    public Reservation(int id, LocalDate date, Passenger passenger, Flight flight) {
        this.setId(id);
        this.setDate(date);
        this.setPassenger(passenger);
        this.setFlight(flight);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
}
