import java.util.List;

/**
 * The class represents a customer's booking.
 *
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Booking
{
    private Show show;
    private List<Seat> seats;
    private Customer customer;
    
    /**
     * Constructs a booking with show, seats, and customer.
     * 
     * @param show The show to be booked
     * @param seats The seats reserved for the booking
     * @param customer The customer making the booking
     */
    public Booking(Show show, List<Seat> seats, Customer customer) {
        this.show = show;
        this.seats = seats;
        this.customer = customer;
    }
}