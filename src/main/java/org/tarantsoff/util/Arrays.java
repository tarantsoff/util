package org.tarantsoff.util;

/**
 * Utility class. Provides method for compare parts of character arrays.
 */
public class Arrays {

    /**
     * Compares
     * @param src - search source
     * @param startIndex start index
     * @param dst
     * @param dstStartIndex
     * @param length
     * @return
     */
    public static boolean arraysContains(char[] src, int startIndex, char[] dst, int dstStartIndex, int length) {
        for (int i = 0; i < length; i++) {
            if (src[i + startIndex] != dst[i + dstStartIndex]) {
                return false;
            }
        }
        return true;
    }

    public static boolean arraysContains(char[] src, int srcStartIndex, char[] dst) {
        return arraysContains(src, srcStartIndex, dst, 0, dst.length);
    }
}
