import java.util.Calendar;

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
    
    /**
     * Constructs a show with a title, time, and theater.
     * 
     * @param title The movie title
     * @param time The time of the show
     * @param theater The theater where the show will take place
     */
    public Show(String title, Calendar time, Theater theater) {
        this.movieTitle = title;
        this.showTime = time;
        this.theater = theater;
    }
}
