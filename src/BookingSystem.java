import java.util.*;
import java.time.*;

class Booking {
    String name;
    LocalDate date;
    int startHour;
    int endHour;

    Booking(String name, LocalDate date, int startHour, int endHour) {
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }
}

public class BookingSystem {

    static ArrayList<Booking> bookings = new ArrayList<>();

    // Check overlapping slots
    static boolean isSlotAvailable(LocalDate date, int newStart, int newEnd) {
        for (Booking b : bookings) {
            if (b.date.equals(date)) {

                // Overlap condition
                if (!(newEnd <= b.startHour || newStart >= b.endHour)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void addBooking(Scanner sc) {
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            System.out.print("Enter Start Hour (0-23): ");
            int start = sc.nextInt();

            System.out.print("Enter End Hour (1-24): ");
            int end = sc.nextInt();
            sc.nextLine(); // consume newline

            // Validation
            if (start < 0 || start > 23 || end < 1 || end > 24) {
                System.out.println("❌ Invalid hour range!");
                return;
            }

            if (end <= start) {
                System.out.println("❌ End hour must be greater than start hour!");
                return;
            }

            if (isSlotAvailable(date, start, end)) {
                bookings.add(new Booking(name, date, start, end));
                System.out.println("✅ Booking Confirmed for " + name +
                        " on " + date +
                        " from " + start + " to " + end);
            } else {
                System.out.println("❌ Time slot overlaps!");
            }

        } catch (Exception e) {
            System.out.println("❌ Invalid input!");
            sc.nextLine(); // reset scanner
        }
    }

    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        System.out.println("\n--- All Bookings ---");
        for (Booking b : bookings) {
            System.out.println(b.name + " | " + b.date + " | " +
                    b.startHour + " - " + b.endHour);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Booking");
            System.out.println("2. View Bookings");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBooking(sc);
                    break;
                case 2:
                    viewBookings();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}