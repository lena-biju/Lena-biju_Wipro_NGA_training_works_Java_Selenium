package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.java.Box; 

class BoxTest {
Box box = new Box();
    
@Test
public void testCircleArea() {
    assertEquals(78.5, box.circleArea(5), 0.001);
}

@Test
public void testTriangleArea() {
    assertEquals(40.0, box.triangleArea(10, 8), 0.001);
}

@Test
public void testSquareArea() {
    assertEquals(36.0, box.squareArea(6), 0.001);
}

@Test
public void testRectangleArea() {
    assertEquals(96.0, box.rectangleArea(12, 8), 0.001);
}

@Test
public void testSimpleInterest() {
    assertEquals(100.0, box.simpleInterest(1000, 5, 2), 0.001);
}

@Test
public void testCalculateAmount() {
    assertEquals(1202.5, box.calculateAmount(), 0.001);
}
}