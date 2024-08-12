package Main;

import EntityClasses.Bus;
import EntityClasses.Customer;
import System.TicketReservationSystem;

import java.util.Scanner; 

public class main {
    private static TicketReservationSystem reservationSystem = new TicketReservationSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nBus Tickets Reservation System");
            System.out.println("1. Register Customer");
            System.out.println("2. Register Bus");
            System.out.println("3. Search Buses");
            System.out.println("4. Reserve Seat");
            System.out.println("5. Cancel Reservation");
            System.out.println("6. Display All Reservations");
            System.out.println("7. Display Customers Oldest to Newest");
            System.out.println("8. Display Customers Newest to Oldest");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    registerCustomer();
                    break;
                case 2:
                    registerBus();
                    break;
                case 3:
                    searchBuses();
                    break;
                case 4:
                    reserveSeat();
                    break;
                case 5:
                    cancelReservation();
                    break;
                case 6:
                    displayReservations();
                    break;
                case 7:
                    displayCustomersOldestToNewest();
                    break;
                case 8:
                    displayCustomersNewestToOldest();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter email ID: ");
        String emailId = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Customer customer = new Customer(name, mobileNumber, emailId, city, age);
        reservationSystem.registerCustomer(customer);
    }

    private static void registerBus() {
        System.out.print("Enter bus number: ");
        String busNumber = scanner.nextLine();
        System.out.print("Enter total seats: ");
        int totalSeats = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter seating point: ");
        String seatingPoint = scanner.nextLine();
        System.out.print("Enter ending point: ");
        String endingPoint = scanner.nextLine();
        System.out.print("Enter starting time: ");
        String startingTime = scanner.nextLine();
        System.out.print("Enter fare: ");
        double fare = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Bus bus = new Bus(busNumber, totalSeats, seatingPoint, endingPoint, startingTime, fare);
        reservationSystem.registerBus(bus);
    }

    private static void searchBuses() {
        System.out.print("Enter starting point: ");
        String from = scanner.nextLine();
        System.out.print("Enter ending point: ");
        String to = scanner.nextLine();
        reservationSystem.searchBuses(from, to);
    }

    private static void reserveSeat() {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        Customer customer = reservationSystem.findCustomerByName(customerName);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.print("Enter bus number: ");
        String busNumber = scanner.nextLine();
        Bus bus = reservationSystem.findBusByNumber(busNumber);
        if (bus == null) {
            System.out.println("Bus not found.");
            return;
        }

        System.out.print("Enter seat number to reserve: ");
        int seatIndex = scanner.nextInt();
        scanner.nextLine(); // consume newline
        reservationSystem.reserveSeat(customer, bus, seatIndex);
    }

    private static void cancelReservation() {
        reservationSystem.cancelReservation();
    }

    private static void displayReservations() {
        reservationSystem.displayReservations();
    }

    private static void displayCustomersOldestToNewest() {
        reservationSystem.displayCustomersOldestToNewest();
    }

    private static void displayCustomersNewestToOldest() {
        reservationSystem.displayCustomersNewestToOldest();
    }
}


