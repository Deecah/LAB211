package week5.Airport;

import java.time.LocalDateTime;
import Utilities.Utility;
public class FlightInformation {

    private String flightNumber;
    private String seatNumber;
    private LocalDateTime timePickUp;

    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = "";
        this.timePickUp = LocalDateTime.now();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(LocalDateTime timePickUp) {
        this.timePickUp = timePickUp;
    }

    

    public void input() {
        flightNumber = Utility.getValidString("^F\\d{3}$", "Flight(F-XXX): ", "Invalid flight!!!");
        seatNumber = Utility.getValidString("^S\\d{2}$", "Seat(S-XX): ", "Invalid seat!!!");
        timePickUp = Utility.getValidDateTime("Time pick up: ", "Please enter a valid date!!!");
    }

}
