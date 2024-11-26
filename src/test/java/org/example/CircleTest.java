package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class CircleTest extends TestCase {
    Circle circle = new Circle(4.0);

  @Test
    public void testCircleArea() {
      assertEquals(18, circle.perimeter(3.0));
  }

  @Test
    public void testCirclePerimeter() {
      assertThrows(IllegalArgumentException.class, () -> circle.perimeter(-1));
      assertEquals(50.26548245743669, circle.area());
  }
}