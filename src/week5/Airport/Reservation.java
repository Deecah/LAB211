
package week5.Airport;
import Utilities.Utility;
import java.time.LocalDate;
import java.util.List;

public class Reservation {
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private LocalDate bookingDate;
    private FlightInformation flightInformation;

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = "";
        this.bookingDate = LocalDate.now();
        this.flightInformation = new FlightInformation();
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

   
    
    public void inputR(List<Reservation> listR){
        while(true){
            bookingID = Utility.getValidString("^\\d{6}$","Booking ID(XXXXXX): ", "Data input is invalid");
            boolean isDuplicate = false;
            for(Reservation r : listR){
                if(r.getBookingID().equals(bookingID)){
                    isDuplicate = true;
                    System.out.println("Duplicate booking ID!!!");
                }
            }
            if(isDuplicate == false){
                break;
            }
        }
        
        customerName = Utility.getValidString("^[A-Za-z ]+$", "Name: ", "Data input is invalid");
        phoneNumber = Utility.getValidString("^\\d{12}$", "Phone(12 digits): ", "Data input is invalid");
        roomNumber = Utility.getValidString("^R\\d{3}$", "Room(R-XXX): ", "Data input is invalid");
        while(true){
            bookingDate = Utility.getValidDate("Booking Date: ", "Data input is invalid");
            if (!bookingDate.isBefore(LocalDate.now())){
                break;
            }
            if (bookingDate.isBefore(LocalDate.now())){
                System.out.println("Invalid data");
            }
        }
        
        flightInformation.input();
    }
}
