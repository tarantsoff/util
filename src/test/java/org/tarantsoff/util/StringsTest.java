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
}
