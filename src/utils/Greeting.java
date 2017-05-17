package utils;

/**
 * Class which builds greeting from date-depended word and input user name
 *
 * @see GreetingPrefix
 * @see UserName
 */

public class Greeting {

    /**
     * Variable for selecting greeting depended on date
     *
     * @see GreetingPrefix
     */
    private GreetingPrefix greetingPrefix = new GreetingPrefix();
    /**
     * Variable for reading user name from terminal
     * @see UserName
     */
    private UserName userName = new UserName();

    /**
     * Invokes getGreetingPrefix() and getUserName() for building greeting
     *
     * @see GreetingPrefix#getGreetingPrefix()
     * @see UserName#getUserName()
     * @return date-dependent greeting
     */

    public String getGreeting() {
        return greetingPrefix.getGreetingPrefix() + userName.getUserName() + "!";
    }
}
