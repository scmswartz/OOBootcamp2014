import junit.framework.TestCase;

public class SquareTest extends TestCase {

    public void testThatOneSquareEqualsAnotherSquareWithTheSameSides() throws Exception {
        assertTrue(new Square(2).equals(new Square(2)));
    }

    public void testThatOneSquareDoesNotEqualAnotherSquare() throws Exception {
        assertFalse(new Square(1).equals(new Square(2)));
    }

    public void test() throws Exception {


    }
}
