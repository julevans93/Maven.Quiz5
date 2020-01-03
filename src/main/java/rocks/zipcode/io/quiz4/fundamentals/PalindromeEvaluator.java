package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substrings = StringEvaluator.getAllSubstrings(string);
        ArrayList<String> palindromes = new ArrayList<>();

        for (String substringToEval: substrings) {
            if (isPalindrome(substringToEval)) {
                palindromes.add(substringToEval);
            }
        }
        return palindromes.toArray(new String[0]);
    }


    public static Boolean isPalindrome(String string) {
        StringBuilder result = new StringBuilder(string);
        return result.reverse().toString().equals(string);
    }

    public static String reverseString(String string) {
        StringBuilder result = new StringBuilder(string);
        return result.reverse().toString();
    }
}
