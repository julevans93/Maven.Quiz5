package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substring = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                substring.add(string.substring(i, j));

            }
        }
        return substring.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> commonSubstrings = new TreeSet<>();
        String[] sub1 = getAllSubstrings(string1);
        String[] sub2 = getAllSubstrings(string2);
        for (int i = 0; i < sub1.length; i++){
            for (int j = 0; j < sub2.length; j++){
                if (sub1[i].equals(sub2[j])){
                    commonSubstrings.add(sub1[i]);
                }
            }
        }

        return commonSubstrings.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String [] substring = getCommonSubstrings(string1, string2);
        String largest = substring[0];
        for (String word: substring){
            if (word.length() > largest.length()){
                largest = word;
            }
        }
        return largest;
    }
}
