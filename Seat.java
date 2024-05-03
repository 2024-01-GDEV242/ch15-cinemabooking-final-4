
/**
 * The class represents a single seat.
 *
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Seat
{
    private int seatNumber;
    private boolean isBooked;
    
    /**
     * Constructs a seat with a seat number.
     * 
     * @param seatNumber The seat number
     */
    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }
    
    /**
     * Books the seat.
     */
    public void bookSeat() {
        this.isBooked = true;
    }
}
