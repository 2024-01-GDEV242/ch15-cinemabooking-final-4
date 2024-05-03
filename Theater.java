import java.util.ArrayList;
import java.util.List;

/**
 * The class represents a single theater within the cinema complex. Each theater will have 
 * multiple rows of seats.
 * 
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Theater
{
    private int theaterId;
    private List<Row> rows = new ArrayList<>();
    
    /**
     * Constructs a theater with a number of rows and seats per row.
     * 
     * @param id The identifier for the theater
     * @param numberOfRows The number of rows in the theater
     * @param seatsPerRow The number of seats per row
     */
     public Theater(int id, int numberOfRows, int seatsPerRow) {
        this.theaterId = id;
        for (int i = 0; i < numberOfRows; i++) {
            rows.add(new Row(i, seatsPerRow));
        }
    }
}
