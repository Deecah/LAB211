package week5.Airport;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import Utilities.Utility;
public class ReservationManagement {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy H:m");
    private static List<Reservation> reservations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add reservation");
            System.out.println("2. Update Reservation");
            System.out.println("3. Delete Reservation");
            System.out.println("4. Display all reservation");
            System.out.println("5. Hiển thị đặt chỗ cần đón");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addReservation();
                    break;
                case 2:
                    updateReservation();
                    break;
                case 3:
                    deleteReservation();
                    break;
                case 4:
                    displayAllReservations();
                    break;
                case 5:
                    displayPickUpReservations();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    public static Scanner sc = new Scanner(System.in);

    private static void addReservation() {
        Reservation dk = new Reservation();
        dk.inputR(reservations);
        reservations.add(dk);
    }

    private static void updateReservation() {
        String id = Utility.getValidString("^\\d{6}$", "Enter booking ID(X.X.X.X.X.X) to update: ", "Data input is invalid");
        for (Reservation r : reservations) {
            if (r.getBookingID().equals(id)) {
                Field[] fields = Reservation.class.getDeclaredFields();
                for (int i = 1; i < fields.length; i++) {
                    System.out.println(i + "." + fields[i].getName());
                }
                int choose;
                while (true) {
                    choose = Utility.getValidInt("Enter your choice to edit:", "Invalid input");
                    if (choose < 1 || choose >= fields.length) {
                        System.out.println("Invalid data!!!");
                    } else {
                        break;
                    }
                }
                Field field = fields[choose];
                field.setAccessible(true);
                try {
                    if (field.getType() == Integer.class) {
                        field.set(r, Utility.getValidInt("Enter new data: ", "Invalid data!!!"));
                    } else if (field.getType() == Double.class) {
                        field.set(r, Utility.getValidDouble("Enter new data: ", "Invalid data!!!"));
                    } else if (field.getType() == LocalDate.class) {
                        field.set(r, Utility.getValidDate("Enter new data: ", "Invalid data!!!"));
                    } else if (field.getType() == LocalDateTime.class) {
                        field.set(r, Utility.getValidDateTime("Enter new data (dd/MM/yyyy HH:mm): ", "Invalid data!!!"));
                    } else if (field.getType() == String.class) {
                        System.out.print("Enter new data: ");
                        field.set(r, sc.nextLine());
                    } else if (field.getType() == FlightInformation.class) {
                        System.out.println("Updating Flight Information...");
                        FlightInformation flight = new FlightInformation();
                        flight.input();
                        field.set(r, flight);
                    }
                    }catch (IllegalAccessException | IllegalArgumentException e) {
                    System.out.println(e);
                }
                }
            }
        }

    

    private static void deleteReservation() {
        Iterator<Reservation> iterator = reservations.iterator();

        System.out.println("Enter booking ID:");
        String dele = sc.nextLine().trim();
        boolean isFound = false;
        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.getBookingID().equals(dele)) {
                iterator.remove();
                isFound = true;
                System.out.println("Delete Success");
                break;

            }
        }
        if (isFound == false) {
            System.out.println("No data found!!!");
        }
    }

    private static void displayAllReservations() {

        for (Reservation r : reservations) {
            System.out.println(r.getBookingID() + " | "
                    + r.getCustomerName() + " | "
                    + r.getPhoneNumber() + " | "
                    + r.getRoomNumber() + " | "
                    + r.getBookingDate() + " | "
                    + r.getFlightInformation().getFlightNumber() + " | "
                    + r.getFlightInformation().getSeatNumber() + " | "
                    + r.getFlightInformation().getTimePickUp().format(formatter));
        }
    }

    private static void displayPickUpReservations() {
        LocalDateTime now = LocalDateTime.now();

        List<Reservation> upcomingReservations = reservations.stream()
                .filter(res -> !res.getFlightInformation().getTimePickUp().isBefore(now))
                .sorted((r1, r2) -> r1.getFlightInformation().getTimePickUp()
                .compareTo(r2.getFlightInformation().getTimePickUp()))
                .collect(Collectors.toList());

        System.out.println("Upcoming Reservations (sorted by pick-up time):");
        if (upcomingReservations.isEmpty()) {
            System.out.println("No upcoming reservations found.");
            return;
        }
        for (Reservation res : upcomingReservations) {
            FlightInformation flight = res.getFlightInformation();
            System.out.printf("Booking ID: %s, Customer: %s, Flight: %s, Seat: %s, Pick-up Time: %s%n",
                    res.getBookingID(), res.getCustomerName(), flight.getFlightNumber(),
                    flight.getSeatNumber(), flight.getTimePickUp().format(formatter));
        }
    }
}
