package utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @see GreetingPrefix
 * @see org.junit.runners.JUnit4
 */

public class GreetingPrefixTest {

    /**
     * Checks if date is even
     * @throws Exception "today is even date, must be HI"
     */
    @Test
    public void test1SelectGreeting() throws Exception {
        assertEquals("today is even date, must be HI", "Hi, ", GreetingPrefix.getDayMod(8));
    }

    /**
     * Checks if date is odd
     * @throws Exception "today is odd date, must be HELLO"
     */
    @Test
    public void test2SelectGreeting() throws Exception {
        assertEquals("today is odd date, must be HELLO", "Hello, ", GreetingPrefix.getDayMod(7));
    }

}
