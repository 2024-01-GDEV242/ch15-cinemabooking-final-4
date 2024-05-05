import java.util.ArrayList;
import java.util.List;

/**
 * The class has each row that is apart of a theater and has several seats.
 *
 * @author Juan Jimenez
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
        for (int i = 0; i < numSeats; i++) {
            seats.add(new Seat(i));
        }
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
    
}