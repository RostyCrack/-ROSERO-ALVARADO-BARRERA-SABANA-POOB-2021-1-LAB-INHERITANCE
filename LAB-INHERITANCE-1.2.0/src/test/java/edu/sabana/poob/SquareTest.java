package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private static Square s1;
    private static Square s2;
    private static Square s3;

    @BeforeAll
    public static void setUp(){
        s1 = new Square("red");
        s2 = new Square("blue", 2);
        s3 = new Square(6);
    }

    @Test
    public void isAreaCorrect(){
        assertEquals(1, (int) s1.getArea());
        assertEquals(4, (int) s2.getArea());
        assertEquals(36, (int) s3.getArea());
    }

    @Test
    public void isToStringCorrect(){
        assertEquals("This is a Square with color red with width 1.0, and length 1.0", s1.toString());
        assertEquals("This is a Square with color NONE with width 6.0, and length 6.0", s3.toString());
        assertEquals("This is a Square with color blue with width 2.0, and length 2.0", s2.toString());
    }

    @Test
    public void isDiagonalOK(){
        assertEquals(1, (int) s1.getDiagonal());
        assertEquals(2, (int) s2.getDiagonal());
        assertEquals(8, (int) s3.getDiagonal());

    }
}
