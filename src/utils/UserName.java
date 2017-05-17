package utils;

import java.util.Scanner;

/**
 * Class which gets user name from terminal
 *
 * @see java.util.Scanner
 * @see SpellChecker
 */

public class UserName {

    private static String YOU_HAVE_ONLY = "you have only ";
    private static String WRONG_NAME = "You've entered wrong name!";

    /**
     * Array of amount of attempts
     */
    private static String attempt[] = {"one","two","three"};

    /**
     * Variable for saving user name
     */
    private static String userName;

    /**
     * Variable for terminal input
     */
    private static Scanner in = new Scanner(System.in);

    /**
     * Invokes getName(), removes extra spaces before, between and after words using RegExp,
     * trims result and checks name correctness in SpellChecker
     *
     * @see jdk.nashorn.internal.runtime.regexp.RegExp
     * @see UserName#getName()
     * @see SpellChecker
     * @see SpellChecker#isValidName(String)
     * @return correct user name
     */
    public static String getCorrectName(){

        int attemptCount = 2;
        do {
            attemptLeft(attemptCount);
            userName = getName().replaceAll("\\s{2,}", " ").trim();
            boolean check = SpellChecker.isValidName(userName);

            if (!check) {
                System.out.println(WRONG_NAME);
                if (attemptCount == 0) {
                    System.out.println("\nGood bye! ");
                    System.exit(0);
                }
            }else {
                break;
            }

            attemptCount--;
        } while (attemptCount >= 0);

        return userName;
    }

    /**
     * Shows number of attempt
     *
     * @param i is counter of attempts
     */
    public static void attemptLeft(int i) {
        System.out.print(YOU_HAVE_ONLY + attempt[i] + " attempt");
        System.out.println((0 == i) ? ":" : "s:");

    }

    /**
     * Reads data from terminal
     *
     * @return name from terminal
     */
    public static String getName() {
        return in.nextLine();
    }

    /**
     * Returns correct user name for further operations
     *
     * @see Greeting
     * @return user name
     */
    public String getUserName() {
        return getCorrectName();
    }
}