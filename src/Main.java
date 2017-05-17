import utils.Greeting;

/**
 * Написать программу, используя классы и методы, которая бы спрашивала имя из консоли.<br>
 * Если дата четная, то выводить приветствие: "Привет, (имя)!"<br>
 * Если дата нечетная, то выводить приветствие: "Здравствуй, (имя)!"
 *
 * @author Emin K. Aliiev
 * @version 3.6.00
 * @since   2015-10-15
 */

public class Main {
    /**
     * Starts the program.
     * Invokes method which displays the greeting.
     *
     * @see Greeting
     * @see Greeting#getGreeting()
     */
    static {
        System.out.println("Input your name, it must contains only alphabetical symbols, " +
                "allowed spaces, hyphens and apostrophes between words.");
    }

    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        System.out.println(greeting.getGreeting());

    }
}