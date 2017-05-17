package utils;

import java.util.Calendar;

/**
 * Class which selects greeting depended on date
 *
 * @see java.util.Calendar
 */

public class GreetingPrefix {

    /**
     * Variable for getting system date
     *
     * @see Calendar
     */
    private static Calendar cal = Calendar.getInstance();

    /**
     * Selects greeting prefix depended on date
     *
     * @param currentDay is system date
     * @return variant of greeting
     */
    public static String getDayMod(int currentDay) {
        int currentDayMod = currentDay % 2;
        return (currentDayMod == 0) ? "Hi, ":"Hello, ";
    }

    /**
     * Gets day of the month from system date
     * Returns greetings depended on date
     * @see Calendar
     * @return result of selecting greetings
     */
    public String getGreetingPrefix() {
        return getDayMod(cal.get(Calendar.DAY_OF_MONTH));
    }

}
