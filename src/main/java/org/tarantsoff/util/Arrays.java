package org.tarantsoff.util;

/**
 * Utility class. Provides method for compare parts of character arrays.
 */
public class Arrays {

    /**
     * Compares two arrays, char by char, starting from given start indexes
     *
     * @param src           the first array for compare
     * @param startIndex    start index in first array
     * @param dst           the second array for compare
     * @param dstStartIndex start index in second array
     * @param length        how many characters need to compare
     * @return returns true if first array contains same char sequence which starts from given index
     */
    public static boolean arraysContains(char[] src, int startIndex, char[] dst, int dstStartIndex, int length) {
        for (int i = 0; i < length; i++) {
            if (src[i + startIndex] != dst[i + dstStartIndex]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compares two arrays, char by char, starting from given start index of first array
     * and zero index of second array. The count of chars for compare is exactly length of second array.
     *
     * @param src the first array for compare
     * @param dst the second array for compare
     * @return returns true if first array contains same char sequence which starts from given index
     */
    public static boolean arraysContains(char[] src, int srcStartIndex, char[] dst) {
        return arraysContains(src, srcStartIndex, dst, 0, dst.length);
    }
}
