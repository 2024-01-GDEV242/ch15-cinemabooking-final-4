import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Iterator;

/**
 * This is the main class that integrates all other classes and functionalities. It could 
 * handle tasks like adding theaters, scheduling shows, and processing bookings.
 * 
 * @author Alper Hiz & Juan jimenez
 * @version 4/29/24
 */

public class CinemaBookingSystem {
    private List<Theater> theaters = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();


    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem() {
    }

    /**
     * Main method to run the cinema booking system.
     */
    public static void main(String[] args) {
        CinemaBookingSystem bookingSystem = new CinemaBookingSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cinema Booking System!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add Theater");
            System.out.println("2. Schedule Show");
            System.out.println("3. Book Seats");
            System.out.println("4. Find Shows by Title");
            System.out.println("5. Check Available Seats");
            System.out.println("6. Add Movie");
            System.out.println("7. Cancel Booking");
            System.out.println("8. Find 4 Adjacent Seats");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTheater(bookingSystem, scanner);
                    break;
                case 2:
                    scheduleShow(bookingSystem, scanner);
                    break;
                case 3:
                    bookSeats(bookingSystem, scanner);
                    break;
                case 4:
                    findShowsByTitle(bookingSystem, scanner);
                    break;
                case 5:
                    checkAvailableSeats(bookingSystem, scanner);
                    break;
                case 6:
                    addMovie(bookingSystem, scanner);
                    break;
                case 7:
                    cancelBooking(bookingSystem, scanner);
                    break;
                case 8:
                    findAdjacentSeats(bookingSystem, scanner);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Adds a theater to the system.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void addTheater(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter theater ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter number of rows: ");
        int numberOfRows = scanner.nextInt();
        System.out.print("Enter seats per row: ");
        int seatsPerRow = scanner.nextInt();
        scanner.nextLine();

        Theater theater = new Theater(id, numberOfRows, seatsPerRow);
        bookingSystem.addTheater(theater);
        System.out.println("Theater added successfully!");
    }

    /**
     * Schedules a show in a theater.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void scheduleShow(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter theater ID: ");
        int theaterId = scanner.nextInt();
        scanner.nextLine();

        Theater theater = bookingSystem.getTheaterById(theaterId);
        if (theater == null) {
            System.out.println("Theater not found.");
            return;
        }

        System.out.print("Enter show ID: ");
        int showId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();
        scanner.nextLine();

        Calendar showTime = Calendar.getInstance();
        showTime.set(year, month - 1, day, hour, minute);

        Show show = new Show(showId, title, showTime, theater);
        bookingSystem.scheduleShow(theater, show);
        System.out.println("Show scheduled successfully!");
    }

    /**
     * Handles booking seats for a show.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void bookSeats(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter show ID: ");
        int showId = scanner.nextInt();
        System.out.print("Enter row number: ");
        int rowNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter seat numbers to book (comma-separated): ");
        String[] seatNumbersStr = scanner.nextLine().split(",");
        List<Integer> seatNumbers = new ArrayList<>();
        for (String seat : seatNumbersStr) {
            seatNumbers.add(Integer.parseInt(seat.trim()));
        }
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        String phoneNumber = scanner.nextLine();

        Customer customer = new Customer(name, phoneNumber);
        boolean success = bookingSystem.bookSeats(showId, rowNumber, seatNumbers, customer);

        if (success) {
            System.out.println("Seats booked successfully!");
        } else {
            System.out.println("Booking failed. Please try again.");
        }
    }

    /**
     * Finds shows by movie title.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void findShowsByTitle(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        List<Show> shows = bookingSystem.findShowsByTitle(title);
        if (shows.isEmpty()) {
            System.out.println("No shows found for the given title.");
        } else {
            System.out.println("Shows found:");
            for (Show show : shows) {
                System.out.println(show);
            }
        }
    }

    /**
     * Checks available seats for a specific show.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void checkAvailableSeats(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter show ID: ");
        int showId = scanner.nextInt();
        scanner.nextLine();

        List<Seat> availableSeats = bookingSystem.getAvailableSeats(showId);
        if (availableSeats.isEmpty()) {
            System.out.println("No seats available.");
        } else {
            System.out.println("Available seats:");
            for (Seat seat : availableSeats) {
                System.out.println(seat);
            }
        }
    }

    /**
     * Adds a new movie to the system.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void addMovie(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter duration (minutes): ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter rating: ");
        String rating = scanner.nextLine();

        Movie movie = new Movie(title, genre, director, duration, rating);
        bookingSystem.addMovie(movie);
        System.out.println("Movie added successfully!");
    }

    /**
     * Cancels an existing booking.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void cancelBooking(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        boolean success = bookingSystem.cancelBooking(customerName);
        if (success) {
            System.out.println("Booking canceled successfull!");
        } else {
            System.out.println("Booking not found or cancellation failed.");
        }
    }

    /**
     * Searches for 4 adjacent seats in a specific showing.
     * 
     * @param bookingSystem The instance of the CinemaBookingSystem
     * @param scanner       The Scanner object for user input
     */
    private static void findAdjacentSeats(CinemaBookingSystem bookingSystem, Scanner scanner) {
        System.out.print("Enter show ID: ");
        int showId = scanner.nextInt();
        scanner.nextLine();

        List<Seat> adjacentSeats = bookingSystem.findAdjacentSeats(showId, 4);
        if (adjacentSeats.isEmpty()) {
            System.out.println("No 4 adjacent seats found.");
        } else {
            System.out.println("4 adjacent seats found:");
            for (Seat seat : adjacentSeats) {
                System.out.println(seat);
            }
        }
    }

    /**
     * Adds a theater to the system.
     * 
     * @param theater The theater to add
     */
    public void addTheater(Theater theater) {
        theaters.add(theater);
    }

    /**
     * Adds a movie to the system.
     * 
     * @param movie The movie to add
     */
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    /**
     * Handles booking seats for a showing.
     *
     * @param showId The showing ID
     * @param rowNumber The row number where the seat is located
     * @param seatNumbers A list of seat numbers to be booked
     * @param customer The customer who is booking the seats
     * @return true if the booking is successful
     */
    public boolean bookSeats(int showId, int rowNumber, List<Integer> seatNumbers, Customer customer) {
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                if (show.getShowId() == showId) {
                    List<Seat> bookedSeats = show.bookSeats(rowNumber, seatNumbers, customer);
                    if (!bookedSeats.isEmpty()) {
                        bookings.add(new Booking(show, bookedSeats, customer));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Cancels a booking for a given customer name.
     * 
     * @param customerName The customer name for whom to cancel the booking
     * @return true if the booking was successfully canceled, false otherwise
     */
    public boolean cancelBooking(String customerName) {
        Iterator<Booking> iterator = bookings.iterator();
        while (iterator.hasNext()) {
            Booking booking = iterator.next();
            if (booking.getCustomer().getName().equalsIgnoreCase(customerName)) {
                List<Seat> seats = booking.getSeats();
                for (Seat seat : seats) {
                    seat.setBooked(false);
                }
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Searches for 4 adjacent seats for the showing.
     * 
     * @param showId The showing ID
     * @param numSeats The number of adjacent seats required
     * @return A list of adjacent seats found
     */
    public List<Seat> findAdjacentSeats(int showId, int numSeats) {
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                if (show.getShowId() == showId) {
                    return show.findAdjacentSeats(numSeats);
                }
            }
        }
        return new ArrayList<>();
    }

    /**
     * Finds shows by movie title.
     *
     * @param title The movie title to search for
     * @return A list of shows with the given title
     */
    public List<Show> findShowsByTitle(String title) {
        List<Show> matchedShows = new ArrayList<>();
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                if (show.getMovieTitle().equalsIgnoreCase(title)) {
                    matchedShows.add(show);
                }
            }
        }
        return matchedShows;
    }

    /**
     * Checks available seats for a specific show.
     *
     * @param showId The show ID
     * @return A list of available seats
     */
    public List<Seat> getAvailableSeats(int showId) {
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                if (show.getShowId() == showId) {
                    return show.getAvailableSeats();
                }
            }
        }
        return new ArrayList<>();
    }

    /**
     * Schedules a new show in the theater.
     * 
     * @param theater The theater where the show will take place
     * @param show    The show to add
     */
    public void scheduleShow(Theater theater, Show show) {
        theater.scheduleShow(show);
    }

    /**
     * Gets all theaters in the system.
     * 
     * @return A list of theaters
     */
    public List<Theater> getTheaters() {
        return theaters;
    }

    /**
     * Gets all bookings in the system.
     * 
     * @return A list of bookings
     */
    public List<Booking> getBookings() {
        return bookings;
    }

    /**
     * Returns a string representation of the CinemaBookingSystem object.
     * 
     * @return A string for the CinemaBookingSystem
     */
    @Override
    public String toString() {
        return "CinemaBookingSystem{" +
                "theaters=" + theaters +
                ", bookings=" + bookings +
                '}';
    }

    /**
     * Gets the theater by its ID.
     *
     * @param theaterId The ID of the theater to retrieve
     * @return The theater object if found, otherwise null
     */
    public Theater getTheaterById(int theaterId) {
        for (Theater theater : theaters) {
            if (theater.getTheaterId() == theaterId) {
                return theater;
            }
        }
        return null;
    }
}