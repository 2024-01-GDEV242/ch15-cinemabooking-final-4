
/**
 * The class represents a single seat.
 *
 * @author Alper Hiz & Juan Jimenez
 * @version 4/29/24
 */
public class Seat
{
    private int seatNumber;
    private boolean booked;

    /**
     * Constructs a seat with a seat number.
     * 
     * @param seatNumber The seat number
     */
    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.booked = false;
    }

    /**
     * Books the seat if it's available.
     * 
     * @return true if the seat was successfully booked
     */
    public boolean bookSeat() {
        if (!booked) {
            booked = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the booked status of the seat.
     * 
     * @param booked The new booking of the seat
     */
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    
    /**
     * Checks if the seat is booked.
     * 
     * @return true if the seat is booked, false otherwise
     */
    public boolean isBooked() {
        return booked;
    }

    /**
     * Gets the seat number.
     * 
     * @return The seat number
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the seat number.
     * 
     * @param seatNumber The seat number to set
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * Returns a string representation of the seat.
     * 
     * @return A string representation of the seat
     */
    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber=" + seatNumber +
                ", booked=" + booked +
                '}';
    }
}
