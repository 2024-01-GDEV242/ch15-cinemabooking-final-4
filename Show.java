import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents a movie showing at a specific time in a specific theater.
 *
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Show
{
    private String movieTitle;
    private Calendar showTime;
    private Theater theater;
    private int showId;
    private List<Seat> seats;
    
    /**
     * Constructs a show with a title, time, and theater.
     * 
     * @param title The movie title
     * @param time The time of the show
     * @param theater The theater where the show will take place
     * @param showId The identifier for the show
     */
    public Show(int showId, String title, Calendar time, Theater theater) {
        this.showId = showId;
        this.movieTitle = title;
        this.showTime = time;
        this.theater = theater;
        this.seats = new ArrayList<>();
    }
    
    /**
     * Gets the ID of the show.
     * 
     * @return The show ID
     */
    public int getShowId() {
        return showId;
    }

    /**
     * Gets the title of the movie for the show.
     * 
     * @return The movie title
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * Books multiple seats for this show.
     * 
     * @param rowNumber The row number in the theater
     * @param seatNumbers The seat numbers to book
     * @param customer The customer who is booking the seats
     * @return true if all seats could be booked
     */
    public boolean bookSeats(int rowNumber, List<Integer> seatNumbers, Customer customer) {
        Row row = theater.getRows().get(rowNumber);
        boolean allBooked = true;
        for (int seatNum : seatNumbers) {
            Seat seat = row.getSeats().get(seatNum);
            if (!seat.isBooked()) {
                seat.bookSeat();
            } else {
                allBooked = false;
            }
        }
        return allBooked;
    }
    
    /**
     * Gets a list of all available seats for this show.
     * 
     * @return A list of available seats
     */
    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Row row : theater.getRows()) {
            for (Seat seat : row.getSeats()) {
                if (!seat.isBooked()) {
                    availableSeats.add(seat);
                }
            }
        }
        return availableSeats;
    }
}