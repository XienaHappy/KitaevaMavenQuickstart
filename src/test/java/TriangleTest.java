
import java.text.MessageFormat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest{

    @Test
    @DisplayName("Test 1")
    void test1() throws NotExistTriangleException, WrongTriangleException {
        assertFalse(Triangle.getSquare(3,6,7)==0);
    }

    @ParameterizedTest
    @CsvSource({"3,6,7,8.94427190999916","-3,-6,-7,8.94427190999916","3,-6,7,8.94427190999916","7,6,7,18.973665961010276"})
    @DisplayName("Test 2")
    void test2(int a, int b, int c, double d) throws NotExistTriangleException, WrongTriangleException {
        assertEquals(Triangle.getSquare(a,b,c),d);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongTriangles.csv")
    @DisplayName("Test 3")
    void test3(int a, int b, int c) throws NotExistTriangleException, WrongTriangleException {
        WrongTriangleException thrown = assertThrows(
                WrongTriangleException.class,
                ()->Triangle.getSquare(a, b, c));
        assertTrue(thrown.getMessage().contains("This triangle has no square"));

    }

    @Test
    @DisplayName("Test 4")
    void test4() throws NotExistTriangleException, WrongTriangleException {
        assertThrows(NotExistTriangleException.class, ()->Triangle.getSquare(233, 6, 7));
    }

    // test.quit();
}

