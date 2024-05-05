/**
 * Represents a single seat.
 * 
 * @Author Alper Hiz
 * version 5/5/2024  
 */
public class Seat {
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
     * @return true if the seat was successfully booked, false if it was already booked
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
