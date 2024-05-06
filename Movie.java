import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Represents a movie in the cinema. Has movie details like title, genre, duration, and 
 * rating.
 * 
 * @author Alper Hiz & Juan Jimenez
 * @version 4/29/24
 */
public class Movie {
    private String title;
    private String genre;
    private String director;
    private int duration;
    private String rating;

    /**
     * Constructs a new movie with a title, genre, director, duration, and rating.
     * 
     * @param title The title of the movie
     * @param genre The genre of the movie
     * @param director The director of the movie
     * @param duration The duration of the movie
     * @param rating The movie rating
     */
    public Movie(String title, String genre, String director, int duration, String rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
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
     * Sets the title of the movie.
     * 
     * @param title The new title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Sets the genre of the movie.
     * 
     * @param genre The new genre of the movie
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets the director of the movie.
     * 
     * @return The director
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the director of the movie.
     * 
     * @param director The new director of the movie
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Gets the duration of the movie in minutes.
     * 
     * @return The duration in minutes
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the movie.
     * 
     * @param duration The new duration of the movie in minutes
     */
    public void setDuration(int duration) {
        this.duration = duration;
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
     * Sets the rating of the movie.
     * 
     * @param rating The new rating of the movie
     */
    public void setRating(String rating) {
        this.rating = rating;
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