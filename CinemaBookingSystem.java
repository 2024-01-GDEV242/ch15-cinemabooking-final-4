import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * This is the main class that integrates all other classes and functionalities. It could 
 * handle tasks like adding theaters, scheduling shows, and processing bookings.
 * 
 * @author Juan jimenez
 * @version 4/29/24
 */
public class CinemaBookingSystem
{
    private List<Theater> theaters = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private Map<Show, List<Seat>> seatBookings;

    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem()
    {
        
    }
    
    
    public static void main(String[] args) {
        CinemaBookingSystem bookingSystem = new CinemaBookingSystem();
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Welcome to the Cinema Booking System!");
    
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Movies");
            System.out.println("2. Shows");
            System.out.println("3. Theaters");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
    
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
    
            switch (choice) {
                case 1:
                    handleMovies(bookingSystem, scanner);
                    break;
                case 2:
                    handleShows(bookingSystem, scanner);
                    break;
                case 3:
                    handleTheaters(bookingSystem, scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void handleMovies(CinemaBookingSystem bookingSystem, Scanner scanner) {
        // Implement movie handling logic
        System.out.println("Movies feature coming soon...");
    }
    
    private static void handleShows(CinemaBookingSystem bookingSystem, Scanner scanner) {
        // Implement show handling logic
        System.out.println("Shows feature coming soon...");
    }
    
    private static void handleTheaters(CinemaBookingSystem bookingSystem, Scanner scanner) {
        // Implement theater handling logic
        System.out.println("Theaters feature coming soon...");
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
     * Handles the booking for seats for a showing.
     *
     * @param showId The showing identifier
     * @param rowNumber The row number where the seat is located
     * @param seatNumbers A list of seat numbers to be booked
     * @param customer The customer who is booking the seats
     * @return true if the booking is successful
     */
    public boolean bookSeats(int showId, int rowNumber, List<Integer> seatNumbers, Customer customer) {
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                if (show.getShowId() == showId) {
                    return show.bookSeats(rowNumber, seatNumbers, customer);
                }
            }
        }
        return false;
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
     * @param showId The show identifier
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
     * @return A string representation of the CinemaBookingSystem object
     */
    @Override
    public String toString() {
        return "CinemaBookingSystem{" +
                "theaters=" + theaters +
                ", bookings=" + bookings +
                '}';
    }    
    

}

