import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Represents a movie in the cinema. Has movie details like title, genre, duration, and 
 * rating.
 * 
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Movie {
    private String title;
    private String genre;
    private int duration;
    private String rating;

    /**
     * Constructs a new movie with a title, genre, duration, and rating.
     * 
     * @param title The title of the movie
     * @param genre The genre of the movie
     * @param duration The duration of the movie
     * @param rating The movie rating
     */
    public Movie(String title, String genre, int duration, String rating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    /**
     * Gets the title of the movie.
     * 
     * @return The movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the genre of the movie.
     * 
     * @return The genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the duration of the movie.
     * 
     * @return The duration in minutes
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Gets the rating of the movie.
     * 
     * @return The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Makes a string for the movie details.
     * 
     * @return A string for the movie details
     */
    @Override
    public String toString() {
        return String.format("Movie: %s Genre: %s Duration: %d mins Rating: %s", 
        title, genre, duration, rating);
    }
}