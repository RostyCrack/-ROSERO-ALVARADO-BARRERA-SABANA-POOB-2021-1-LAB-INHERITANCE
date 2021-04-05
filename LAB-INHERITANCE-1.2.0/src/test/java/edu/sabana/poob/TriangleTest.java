package edu.sabana.poob;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;

    @BeforeAll
    public static void setUp(){
        t1 = new Triangle("red", 10, 5, 10);
        t2 = new Triangle("blue");
        t3 = new Triangle( 15, 20, 30);
        t4 = new Triangle(10, 10, 10);
    }

    @Test
    public void isPerimeterCorrect(){
        assertEquals(25, (int) t1.getPerimeter());
        assertEquals(3, (int) t2.getPerimeter());
        assertEquals(65, (int) t3.getPerimeter());
    }

    @Test
    public void isAreaCorrect(){
        assertEquals(24, (int) t1.getArea());
        assertEquals(0, (int) t2.getArea());
        assertEquals(133, (int) t3.getArea());
    }

    @Test
    public void isToStringCorrect(){
        assertEquals("This is a Triangle with color red and sides 10.0, 5.0, 10.0", t1.toString());
        assertEquals("This is a Triangle with color blue and sides 1.0, 1.0, 1.0", t2.toString());
        assertEquals("This is a Triangle with color NONE and sides 15.0, 20.0, 30.0", t3.toString());
    }

    @Test
    public void isIsosecelesCorrect(){
        assertTrue(t1.isIsosceles());
        assertTrue(t2.isIsosceles());
        assertFalse(t3.isIsosceles());
        assertTrue(t4.isIsosceles());
    }

    @Test
    public void isEquilateralOK(){
        assertFalse(t1.isEquilateral());
        assertTrue(t2.isEquilateral());
        assertFalse(t3.isEquilateral());
        assertTrue(t4.isEquilateral());
    }

}
