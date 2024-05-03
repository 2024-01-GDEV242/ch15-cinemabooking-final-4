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
}
