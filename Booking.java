import java.util.List;

/**
 * Represents a booking made by a customer for a show.
 * 
 * @Author Alper Hiz
 * version 5/5/2024
 */
public class Booking {
    private Show show;
    private List<Seat> seats;
    private Customer customer;

    /**
     * Constructs a booking with the given show, seats, and customer.
     * 
     * @param show     The show for which the booking is made
     * @param seats    The list of seats booked
     * @param customer The customer making the booking
     */
    public Booking(Show show, List<Seat> seats, Customer customer) {
        this.show = show;
        this.seats = seats;
        this.customer = customer;
    }

    /**
     * Gets the show for which the booking is made.
     * 
     * @return The show
     */
    public Show getShow() {
        return show;
    }

    /**
     * Sets the show for the booking.
     * 
     * @param show The show to set
     */
    public void setShow(Show show) {
        this.show = show;
    }

    /**
     * Gets the list of seats booked in the booking.
     * 
     * @return The list of seats
     */
    public List<Seat> getSeats() {
        return seats;
    }

    /**
     * Sets the list of seats for the booking.
     * 
     * @param seats The list of seats to set
     */
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    /**
     * Gets the customer who made the booking.
     * 
     * @return The customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer for the booking.
     * 
     * @param customer The customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Returns a string representation of the booking.
     * 
     * @return A string representation of the booking
     */
    @Override
    public String toString() {
        return "Booking{" +
                "show=" + show +
                ", seats=" + seats +
                ", customer=" + customer +
                '}';
    }
}
