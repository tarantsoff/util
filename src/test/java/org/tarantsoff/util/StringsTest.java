package org.tarantsoff.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringsTest {

    @Test
    public void testLastIndexOfSameChar(){
        int result = Strings.lastIndexOf("c", "c");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testLastIndexOfManyTimes(){
        int result = Strings.lastIndexOf("123str456str78str0rst4srs", "str");
        Assertions.assertEquals(14, result);
    }

    @Test
    public void testLastIndexOfDifferentChar(){
        int result = Strings.lastIndexOf("s", "c");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testLastIndexOfEmptyString(){
        int result = Strings.lastIndexOf("", "");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testLastIndexOfSameString(){
        int result = Strings.lastIndexOf("string", "string");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void compareArraysTestEquals(){
        char[] src = "string".toCharArray();
        char[] dst = "string".toCharArray();
        Assertions.assertTrue(Arrays.arraysContains(src, 0, dst));
    }

    @Test
    public void compareArraysTestEqualsLonger(){
        char[] src = "string1".toCharArray();
        char[] dst = "string".toCharArray();
        Assertions.assertTrue(Arrays.arraysContains(src, 0, dst));
    }

    @Test
    public void compareArraysTestEqualsLonger1(){
        char[] src = "123string".toCharArray();
        char[] dst = "string".toCharArray();
        Assertions.assertTrue(Arrays.arraysContains(src, 3, dst));
    }

    @Test
    public void compareArraysTestEqualsLonger4(){
        char[] src = "1234string".toCharArray();
        char[] dst = "string".toCharArray();
        Assertions.assertFalse(Arrays.arraysContains(src, 3, dst));
    }

    @Test
    public void compareArraysTestEqualsLonger5(){
        char[] src = "1234string".toCharArray();
        char[] dst = "string".toCharArray();
        Assertions.assertTrue(Arrays.arraysContains(src, 4, dst, 0, 6));
    }

    @Test
    public void compareArraysTestEqualsLonger7(){
        char[] src = "1234str4321".toCharArray();
        char[] dst = "1234555str5".toCharArray();
        Assertions.assertTrue(Arrays.arraysContains(src, 4, dst, 7, 3));
    }

}
