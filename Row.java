import java.util.ArrayList;
import java.util.List;

/**
 * The class has each row that is apart of a theater and has several seats.
 *
 * @author Alper Hiz & Juan Jimenez
 * @version 4/29/24
 */
public class Row
{
    private int rowNumber;
    private List<Seat> seats = new ArrayList<>();

    /**
     * Constructs a row with number of seats.
     * 
     * @param rowNumber The row number
     * @param numSeats The number of seats in the row
     */
    public Row(int rowNumber, int numSeats) {
        this.rowNumber = rowNumber;
        this.seats = new ArrayList<>();
        for (int i = 0; i < numSeats; i++) {
            seats.add(new Seat(i + 1));
        }
    }

    /**
     * Books seats in the row.
     * 
     * @param seatNumbers The seat numbers to book
     * @return true if all seats were successfully booked, false otherwise
     */
    public boolean bookSeats(List<Integer> seatNumbers) {
        boolean allBooked = true;
        for (int seatNum : seatNumbers) {
            if (seatNum <= seats.size()) {
                Seat seat = seats.get(seatNum - 1);
                if (!seat.bookSeat()) {
                    allBooked = false;
                }
            } else {
                allBooked = false;
            }
        }
        return allBooked;
    }

    /**
     * Gets all seats in the row.
     * 
     * @return A list of seats
     */
    public List<Seat> getSeats() {
        return seats;
    }

    /**
     * Gets the row number.
     * 
     * @return The row number
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the seats for the row.
     * 
     * @param seats The list of seats to set
     */
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    /**
     * Returns a string representation of the row.
     * 
     * @return A string representation of the row
     */
    @Override
    public String toString() {
        return "Row{" +
                "rowNumber=" + rowNumber +
                ", seats=" + seats +
                '}';
    }
}
