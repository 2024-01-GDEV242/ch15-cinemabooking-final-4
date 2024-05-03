import java.util.List;
import java.util.ArrayList;

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
    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem()
    {
        
    }
    
    /**
     * Adds a theater to the system.
     * 
     * @param theater The theater to add
     */
    public void addTheater(Theater theater) {
        theaters.add(theater);
    }
}
