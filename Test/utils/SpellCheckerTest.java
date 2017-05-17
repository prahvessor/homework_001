package utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @see SpellChecker
 * @see GreetingPrefix
 */
public class SpellCheckerTest {

    /**
     * Check the name: not a number
     */
    @Test
    public void test1SpellCheckerFalse(){
        assertFalse(SpellChecker.isValidName("10"));
    }

    /**
     * Check the name: not a one-time pressed spacebar. Input name not trimmed in GetUserName.
     */
    @Test
    public void test2SpellCheckerFalse(){
        assertFalse(SpellChecker.isValidName(" "));
    }

    /**
     * Check the name: not a many-times pressed spacebar
     */
    @Test
    public void test33SpellCheckerFalse(){
        assertFalse(SpellChecker.isValidName("  "));
    }

    /**
     * Check the name: not a null
     */
    @Test
    public void test3SpellCheckerFalse(){
        assertFalse(SpellChecker.isValidName(""));
    }

    /**
     * Check the name: not a mix of letters and numbers
     */
    @Test
    public void test4SpellCheckerFalse(){
        assertFalse(SpellChecker.isValidName("Mark 3"));
    }

    /**
     * Check the name: not a special symbols
     */
    @Test
    public void test5SpellCheckerFalse(){
        assertFalse(SpellChecker.isValidName("~!@#$%^&*()_+:?|><"));
    }

    /**
     * Check the name: correct name which includes only letters and spaces between words
     */
    @Test
    public void test6SpellCheckerTrue(){
        assertTrue(SpellChecker.isValidName("Jean-Claude Van Damme"));
    }

    /**
     * Check the name: incorrect name which includes several spaces between words
     */
    @Test
    public void test7SpellCheckerTrue(){
        assertFalse(SpellChecker.isValidName("Shang     Tsung"));
    }
}
