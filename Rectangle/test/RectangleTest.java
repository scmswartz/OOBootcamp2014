import org.junit.Test;

import static org.junit.Assert.*;


public class RectangleTest {

    @Test (expected = IllegalArgumentException.class)
    public void testException() throws Exception {
        new Rectangle(-1,5);

    }
    @Test
    public void testShouldKnowThatTwoRectanglesAreEqual() throws Exception {
        assertEquals(new Rectangle(1, 2), new Rectangle(1, 2));
    }

    @Test
    public void testShouldKnowThatTwoRectanglesWithTheSameWidthAndDifferentHeightsAreNotEqual() throws Exception {
        assertNotEquals(new Rectangle(2, 3), new Rectangle(2, 5));
    }

    @Test
    public void testShouldKnowThatTwoRectanglesWithTheSameHeightAndDifferentWidthsAreNotEqual() throws Exception {
        assertNotEquals(new Rectangle(2, 3), new Rectangle(1, 3));
    }

    @Test
    public void testShouldKnowThatTwoRectanglesWithDifferentHeightAndWidthAreNotEqual() throws Exception {
        assertNotEquals(new Rectangle(1,2),new Rectangle(4,3));
    }

    @Test
    public void testThatRectangleIsNotNull() throws Exception {
        assertNotNull(new Rectangle(0,0));
    }

    @Test
    public void testArea() throws Exception {

        assertEquals(2, new Rectangle(1,2).area());
    }

    @Test
    public void testTheCalculationOfTheArea() throws Exception {
        int expectedArea = 2*3;
        assertEquals(expectedArea,new Rectangle(2,3).area());
    }

    @Test
    public void testAreaWhereWidthIsZero() throws Exception {
        int expectedArea = 0 * 3;
        assertEquals(expectedArea,new Rectangle(0,3).area());
    }

    @Test
    public void testAreaWhereHeightIsZero() throws Exception {
        int expectedArea = 5 * 0;
        assertEquals(expectedArea, new Rectangle(5,0).area());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeWidthException() throws IllegalArgumentException {
        new Rectangle(-1,2);
    }

    @Test
    public void testNegativeWidthExceptionTryCatch() throws Exception {
        try{
            new Rectangle(-1,5);
            fail("Should have thrown an IllegalArgumentException because width is invalid");
            //assert false;
        }catch (IllegalArgumentException e)
        {
            //assert true
        }
    }

    public void testNegativeHeightExceptionTryCatch() throws Exception {
        try{
            new Rectangle(2,-1);
            fail("Should have thrown an IllegalArgumentException because height is invalid");
        }catch (IllegalArgumentException e)
        {}
    }

    public void testNegativeWidthAndHeightException() throws Exception {
        try{
            new Rectangle(-1,-2);
            fail();
        }catch (IllegalArgumentException e)
        {}
    }

    public void testZeroWidth() throws Exception {
        assertEquals(new Rectangle(0, 5), new Rectangle(0, 5));
    }

    public void testZeroHeight() throws Exception {
        assertEquals(new Rectangle(1, 0), new Rectangle(1, 0));
    }

    public void testZeroWidthAndHeight() throws Exception {
        assertEquals(new Rectangle(0, 0), new Rectangle(0, 0));
    }

    public void testRectangleHasAPerimeter() throws Exception {
        assertEquals(18, new Rectangle(3, 6).perimeter());
    }

    public void testThatRectangleWithSameWidthAndDifferentHeightHaveDifferentPerimeters() throws Exception {
        assertNotEquals(new Rectangle(2, 6).perimeter(), new Rectangle(2, 9).perimeter());
    }

    public void testThatRectangleSameHeightAndDifferentWidthHaveDifferentPerimeters() throws Exception {
        assertNotEquals(new Rectangle(2, 4).perimeter(), new Rectangle(3, 4).perimeter());
    }

    public void testRectangleHasDifferentWidthAndDifferentHeightAndEqualPerimeters() throws Exception {
        assertEquals(8, new Rectangle(1, 3).perimeter());
    }

    public void testThatRectangleWithSameWidthAndDifferentHeightThatThePerimeterIsTwoThirdsOfAnotherRectangle() throws Exception {
        int perimeterOf4 = new Rectangle(2,2).perimeter();
        int perimeterOf6 = new Rectangle(2,4).perimeter();


        assertEquals((2 * perimeterOf6) / 3 , perimeterOf4);
    }
}