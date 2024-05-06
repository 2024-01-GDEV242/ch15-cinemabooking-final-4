import java.util.ArrayList;
import java.util.List;

/**
 * The class represents a single theater within the cinema complex. Each theater will have 
 * multiple rows of seats.
 * 
 * @author Alper Hiz & Juan Jimenez
 * @version 4/29/24
 */
public class Theater
{
    private int theaterId;
    private List<Row> rows = new ArrayList<>();
    private List<Show> shows = new ArrayList<>();

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
    
     /**
     * Gets the ID of the theater.
     * 
     * @return The theater ID
     */
    public int getTheaterId() {
        return theaterId;
    }
    
    /**
     * Schedules a new show in the theater.
     *
     * @param show The show to add
     */
    public void scheduleShow(Show show) {
        shows.add(show);
    }
    
    /**
     * Gets all shows scheduled in the theater.
     * 
     * @return A list of the shows
     */
    public List<Show> getShows() {
        return shows;
    }
    
     /**
     * Gets all rows in the theater.
     * 
     * @return A list of rows
     */
    public List<Row> getRows() {
        return rows;
    }
    
    /**
     * Returns a string representation of the theater.
     * 
     * @return A string representation of the theater
     */
    @Override
    public String toString() {
        return "Theater{" +
                "theaterId=" + theaterId +
                ", rows=" + rows +
                ", shows=" + shows +
                '}';
    }
}