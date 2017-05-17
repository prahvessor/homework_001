package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class which checks spelling of input user name
 *
 * @see UserName
 * @see UserName#getCorrectName()
 */

public class SpellChecker {

    /**
     * Divides entered name by words and makes Array
     *
     * @see UserName
     * @see UserName#getCorrectName()
     * @see SpellChecker#isValidPattern(String)
     * @param name is user name
     * @return true if correct and false if input name is incorrect
     */
    public static boolean isValidName(String name) {

        final String SEPARATOR = " ";

        String[] separatedName = name.split(SEPARATOR);

        if (separatedName.length == 0) {
            return false;
        }

        for (String word : separatedName) {
            if (!isValidPattern(word)) {
                return false;
            }
        }
        return true;

    }

    /**
     * Checks words correctness of input name using Regexp
     * @see jdk.nashorn.internal.runtime.regexp.RegExp
     *
     * @param part is word of divided name
     * @return true if correct and false if input word is incorrect
     */
    public  static boolean isValidPattern(String part) {
        Pattern p = Pattern.compile("^[A-Za-zА-Яа-я'-]+$");
        Matcher m = p.matcher(part);
        return m.matches();
    }
}
