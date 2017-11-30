package org.tarantsoff.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

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
