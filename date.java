import java.util.Calendar;
 
/**
 * The class represents the date and time for the cinema booking
 *
 * @author Juan Jimenez
 * @version 4/29/24
 */
public class Date {
    private int[] dateShowing;
    private Calendar showingTime;
    private static final int YEAR = 0, MONTH = 1, DAY = 2, HOUR = 3, MINUTE = 4;
    private static final int DATE_ELEMENTS = 5;

    /**
     * Constructs a new Date object that holds details about a specific date and time.
     * 
     * @param year The year of the cinema showing
     * @param month The month of the cinema showing
     * @param day The day of the cinema showing
     * @param hour The hour of the cinema showing
     * @param minute The minute of the cinema showing
     */
    public Date(int year, int month, int day, int hour, int minute) {
        dateShowing = new int[DATE_ELEMENTS];
        dateShowing[YEAR] = year;
        dateShowing[MONTH] = month;
        dateShowing[DAY] = day;
        dateShowing[HOUR] = hour;
        dateShowing[MINUTE] = minute;
        setShowingTime();
    }

    /**
     * Initializes and updates the Calendar instance to the date and time.
     */
    private void setShowingTime() {
        showingTime = Calendar.getInstance();
        showingTime.set(Calendar.YEAR, dateShowing[YEAR]);
        showingTime.set(Calendar.MONTH, dateShowing[MONTH] - 1);
        showingTime.set(Calendar.DAY_OF_MONTH, dateShowing[DAY]);
        showingTime.set(Calendar.HOUR_OF_DAY, dateShowing[HOUR]);
        showingTime.set(Calendar.MINUTE, dateShowing[MINUTE]);
    }

    /**
     * Gets the Calendar instance of the showing time.
     * 
     * @return the Calendar object for the date
     */
    public Calendar getShowingTime() {
        return showingTime;
    }
    
    /**
     * Gets the year of the date.
     * 
     * @return the year 
     */
    public int getYear() {
        return dateShowing[YEAR];
    }

    /**
     * Gets the month of the date.
     * 
     * @return the month
     */
    public int getMonth() {
        return dateShowing[MONTH];
    }

    /**
     * Gets the day of the date.
     * 
     * @return the day
     */
    public int getDay() {
        return dateShowing[DAY];
    }

    /**
     * gets the hour of the date.
     * 
     * @return the hour
     */
    public int getHour() {
        return dateShowing[HOUR];
    }

    /**
     * Gets the minute of the date.
     * 
     * @return the minute
     */
    public int getMinute() {
        return dateShowing[MINUTE];
    }

    /**
     * makes a string of the time, which is formated as single-digit numbers.
     * 
     * @return a formatted string of the date and time
     */
    public String timeString() {
        StringBuffer buffer = new StringBuffer();
        for (int value : dateShowing) {
            if (value < 10) {
                buffer.append("0" + value);
            } else {
                buffer.append(value);
            }
            buffer.append(' ');
        }
        return buffer.toString().trim();
    }
}