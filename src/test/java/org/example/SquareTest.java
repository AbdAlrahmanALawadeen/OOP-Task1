package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class SquareTest extends TestCase {

    Square square = new Square(4);

    @Test
    public void testSquareArea() {
        assertEquals(16.0, square.area());
    }

    @Test
    public void testSquarePerimeter() {
        assertThrows(IllegalArgumentException.class, () -> square.perimeter(0));
        assertEquals(4, square.perimeter(1));
    }

}