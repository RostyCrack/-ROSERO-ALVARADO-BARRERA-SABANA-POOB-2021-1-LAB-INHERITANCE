package edu.sabana.poob;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;

    @BeforeAll
    public static void setUp(){
        r1 = new Rectangle("red");
        r2 = new Rectangle(4, 2);
        r3 = new Rectangle("blue", 6,3);
    }

    @Test
    public void isAreaCorrect(){
        assertEquals(2, (int) r1.getArea());
        assertEquals(8, (int) r2.getArea());
        assertEquals(18, (int) r3.getArea());
    }

    @Test
    public void isToStringCorrect(){
        assertEquals("This is a Rectangle with color red with width 2.0, and length 1.0", r1.toString());
        assertEquals("This is a Rectangle with color blue with width 6.0, and length 3.0", r3.toString());
        assertEquals("This is a Rectangle with color NONE with width 4.0, and length 2.0", r2.toString());
    }

    @Test
    public void isDiagonalOK(){
        assertEquals(2, (int) r1.getDiagonal());
        assertEquals(4, (int) r2.getDiagonal());
        assertEquals(6, (int) r3.getDiagonal());

    }

}
