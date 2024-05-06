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
     * Finds adjacent seats in the theater for this show.
     * 
     * @param numSeats The number of adjacent seats required
     * @return A list of adjacent seats if found
     */
    public List<Seat> findAdjacentSeats(int numSeats) {
        List<Seat> adjacentSeats = new ArrayList<>();
        
        for (Row row : theater.getRows()) {
            List<Seat> seats = row.getSeats();
            for (int i = 0; i <= seats.size() - numSeats; i++) {
                boolean allAvailable = true;
                List<Seat> potentialSeats = new ArrayList<>();
                
                for (int i2 = 0; i2 < numSeats; i2++) {
                    Seat seat = seats.get(i + i2);
                    if (seat.isBooked()) {
                        allAvailable = false;
                        break;
                    }
                    potentialSeats.add(seat);
                }
                
                if (allAvailable) {
                    adjacentSeats = potentialSeats;
                    return adjacentSeats;
                }
            }
        }
        
        return adjacentSeats;
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
     public List<Seat> bookSeats(int rowNumber, List<Integer> seatNumbers, Customer customer) {
        Row row = theater.getRows().get(rowNumber - 1);
        List<Seat> bookedSeats = new ArrayList<>();

        for (int seatNum : seatNumbers) {
            Seat seat = row.getSeats().get(seatNum - 1);
            if (!seat.isBooked()) {
                seat.bookSeat();
                bookedSeats.add(seat);
            }
        }

        return bookedSeats;
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