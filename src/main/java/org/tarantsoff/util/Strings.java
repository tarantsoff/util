package org.tarantsoff.util;

public class Strings {

    public static int lastIndexOf(String source, String searchFor){


        if (source.length() < searchFor.length()) {
            return -1;
        }

        char[] sourceChars = source.toCharArray();
        char[] searchForChars = searchFor.toCharArray();

        for (int i = sourceChars.length; i >= searchFor.length(); i--) {
            if (sourceChars[i -1] == searchForChars[searchForChars.length - 1]) {
                int maybeIndex = i - searchForChars.length;
                if (arraysContains(sourceChars, maybeIndex, searchForChars)) {
                    return maybeIndex;
                }
            }
/*
            if (sourceChars[i] != searchForChars[i]) {
                break; // go to the next character
            }
            // if found - compare sub array
*/



        }

        return -1;
    }

    public static boolean arraysContains(char[] src, int srcStartIndex, char[] dst) {
        return arraysContains(src, srcStartIndex, dst, 0, dst.length);
    }

    public static boolean arraysContains(char[] src, int startIndex, char[] dst, int dstStartIndex, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(src[i + startIndex] +
                    " != " +
                    dst[i + dstStartIndex] +
                    " - >" + (src[i + startIndex] != dst[i + dstStartIndex]));
            if (src[i + startIndex] != dst[i + dstStartIndex]) {
                return false;
            }
        }
        return true;
    }
}
