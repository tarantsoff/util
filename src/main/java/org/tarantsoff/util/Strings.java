package org.tarantsoff.util;

/**
 * Utility class for strings manipulations.
 */
public class Strings {

    /**
     * Searches for last occurrence of a given substring
     * @param source the string to check
     * @param searchFor the string we are try to find
     * @return -1 if no occurrences there or index of last occurrence
     */
    public static int lastIndexOf(String source, String searchFor) {

        // special case. considered to return 0 if search string is empty
        if (searchFor.length() == 0) {
            return 0;
        }

        if (source.length() < searchFor.length()) {
            return -1;
        }

        char[] sourceChars = source.toCharArray();
        char[] searchForChars = searchFor.toCharArray();

        for (int i = sourceChars.length; i >= searchFor.length(); i--) {
            if (sourceChars[i - 1] == searchForChars[searchForChars.length - 1]) {
                int maybeIndex = i - searchForChars.length;
                if (Arrays.arraysContains(sourceChars, maybeIndex, searchForChars)) {
                    return maybeIndex;
                }
            }
        }

        return -1;
    }

}
