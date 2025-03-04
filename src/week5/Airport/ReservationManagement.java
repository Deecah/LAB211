package week5.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationManagement {
    private static List<Reservation> reservations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm đặt chỗ");
            System.out.println("2. Tìm kiếm và cập nhật");
            System.out.println("3. Tìm kiếm và xóa");
            System.out.println("4. Hiển thị tất cả");
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
        // Thêm logic tìm kiếm và cập nhật
    }

    private static void deleteReservation() {
        System.out.println("Enter booking ID:");
        String dele = sc.nextLine().trim();
        for(Reservation r : reservations){
            if(r.getBookingID()==dele){
                reservations.remove(r);
                break;
            }
        }
    }

    private static void displayAllReservations() {
        // Thêm logic hiển thị tất cả đặt chỗ
    }

    private static void displayPickUpReservations() {
        // Thêm logic hiển thị đặt chỗ cần đón
    }
}
