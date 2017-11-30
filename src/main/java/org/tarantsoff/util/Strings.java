package org.tarantsoff.util;

public class Strings {

    public static int lastIndexOf(String source, String searchFor) {

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
