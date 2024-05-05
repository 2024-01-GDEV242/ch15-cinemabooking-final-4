/**
 * A class that stores information about a movie.
 * 
 * @Author Alper Hiz
 * version 5/5/2024
 */
public class Movie {
    private String title;
    private String director;
    private String genre;

    /**
     * Constructs a Movie object with the given title, director, and genre.
     * 
     * @param title    The title of the movie
     * @param director The director of the movie
     * @param genre    The genre of the movie
     */
    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    /**
     * Gets the title of the movie.
     * 
     * @return The title of the movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the movie.
     * 
     * @param title The title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the director of the movie.
     * 
     * @return The director of the movie
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the director of the movie.
     * 
     * @param director The director of the movie
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Gets the genre of the movie.
     * 
     * @return The genre of the movie
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the movie.
     * 
     * @param genre The genre of the movie
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Returns a string representation of the movie.
     * 
     * @return A string representation of the movie
     */
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
