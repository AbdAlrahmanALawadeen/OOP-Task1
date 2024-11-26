package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class TriangleTest extends TestCase {

    Triangle triangle = new Triangle(3, 5, 2);

    @Test
    public void testArea() {
        assertEquals(7.5, triangle.area());
    }

    @Test
    public void testPerimeter() {
        assertEquals(10.0, triangle.perimeter());
    }
}