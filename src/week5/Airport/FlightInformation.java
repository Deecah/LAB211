package week5.Airport;

import java.time.LocalDate;

public class FlightInformation {

    private String flightNumber;
    private String seatNumber;
    private LocalDate timePickUp;

    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = "";
        this.timePickUp = LocalDate.now();
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

    public LocalDate getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(LocalDate timePickUp) {
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return "FlightInformation{" + "flightNumber=" + flightNumber + ", seatNumber=" + seatNumber + ", timePickUp=" + timePickUp + '}';
    }

    public void input() {
        flightNumber = Utility.getValidString("^F\\d{3}$", "Flight: ", "Invalid flight!!!");
        seatNumber = Utility.getValidString("^S\\d{2}$", "Seat: ", "Invalid seat!!!");
        timePickUp = Utility.getValidDate("Time pick up: ", "Please enter a valid date!!!");
    }

}
