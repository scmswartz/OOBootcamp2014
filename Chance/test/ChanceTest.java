import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class ChanceTest {
    @Test
    public void testOverriddenEqualsMethodThatOneChanceEqualsAnotherChance() throws Exception {
        assertTrue(new Chance(1, 2).equals(new Chance(1, 2)));
    }

    @Test
    public void testOverriddenEqualsMethodThatOneChanceDoesNotEqualAnotherChance() throws Exception {
        assertFalse(new Chance(1, 2).equals(new Chance(3, 4)));
    }

    //wrote this test the first time and passed. is this a useful test????
    @Test
    public void testThatOneChancesEqualsAnotherChance() throws Exception {
        assertEquals(new Chance(1, 2), new Chance(1, 2));
    }

    //wrote this test the first time and passed. is this a useful test????
    @Test
    public void testThatOneChanceDoesNotEqualAnotherChance() throws Exception {
        assertNotEquals(new Chance(1, 2), new Chance(3, 4));
    }

    //wrote this test the first time and passed. is this a useful test????
    @Test
    public void testThatChanceIsNotNull() throws Exception {
        assertNotNull(new Chance(1, 2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeNumberOfWaysEventCanOccurException() throws Exception {
        new Chance(-1, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testZeroNumberOfWaysEventCanOccurException() throws Exception {
        new Chance(0, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeTotalNumberOfPossibleOutcomesException() throws Exception {
        new Chance(1, -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testZeroNumberOfPossibleOutcomesException() throws Exception {
        new Chance(1, 0);
    }

    //Is this test useful? Isn't it the same as the negative numberOfWaysEventCanOccurException test?
    @Test (expected = IllegalArgumentException.class)
    public void testThatNeitherParameterIsNegativeException() throws Exception {
        new Chance(-1, -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testThatTheNumberOfPossibleOutcomesIsLessThanTheTotalNumberOfPossibleOutcomesException() throws Exception {
        new Chance(6, 4);
    }

    //This test needs to fail for you to implement functionality for it to pass. Remember follow the TDD lifecycle.
    //The question is how to implement the probability ratio without googling what is the formula?
    //How to drive functionality out of implementation from tests??? ITs the how that drives us?
    @Test
    public void testThatTheProbabilityOfOneChanceIsEqualToTheProbabilityOfAnotherChance() throws Exception {
        assertEquals(new Chance(1, 2).probability(), new Chance(1, 2).probability());
    }

    @Test
    public void testThatChanceHasAProbability() throws Exception {
        assertNotNull(new Chance(5, 6).probability());
    }

//    //If probability can be zero then this test is valid
//    @Test
//    public void testThatChanceHasAZeroProbabilityByHavingZeroNumberOfWaysEventCanOccurException() throws Exception {
//        assertEquals(0, new Chance(0, 1).probability());
//    }

    //With this test I want to prove that the return type of probability should be a double. As the probability method is now it returns an int therefore
    //with int division it will always return as a zero. Hence the variables also need to become of type double as well
    @Test
    public void testThatChanceHasAProbabilityAsADoubleReturnType() throws Exception {
        assertEquals(0.5, new Chance(1, 2).probability());
    }

    @Test
    public void testThatChanceHasAProbabilityOfOneWhenBothInputsAreTheSameValue() throws Exception {
        assertEquals(1.0, new Chance(5, 5).probability());
    }

    @Test
    public void testThatOneChanceHasTheSameProbabilityAsAnotherChanceWithDifferentVariables() throws Exception {
        assertEquals(new Chance(2, 3).probability(), new Chance(4, 6).probability());
    }

    @Test
    public void testThatOneChanceHasADifferentProbabilityAsAnotherChanceWithDifferentVariables() throws Exception {
        assertNotEquals(new Chance(1, 5).probability(), new Chance(2, 3).probability());
    }

    @Test
    public void testThatOneChanceHasTheSameProbabilityAsAnotherChanceWithTheSameVariables() throws Exception {
        assertEquals(new Chance(1, 4).probability(), new Chance(1, 4).probability());
    }

    @Test
    public void testThatTheProbabilityOfOneChanceIncreasesAsTheNumeratorIncreasesAndTheDenominatorsAreTheSame() throws Exception {
        assertTrue(new Chance(1, 5).probability() < new Chance(2, 5).probability());
    }

    @Test
    public void testThatTheProbabilityOfOneChanceDecreasesAsTheNumeratorIncreasesAndTheDenominatorsAreTheSame() throws Exception {
        assertTrue(new Chance(4, 5).probability() > new Chance(2, 5).probability());
    }

    @Test
    public void testThatTheProbabilityOfOneChanceDecreasesAsTheNumberOfWaysEventCanOccurIncreasesIsFalse() throws Exception {
        assertFalse(new Chance(3, 5).probability() > new Chance(4, 5).probability());
    }

    @Test
    public void testThatTheProbabilityOfOneChanceDecreasesAsTheDenominatorIncreasesAndTheNumeratorsAreTheSame() throws Exception {
        assertTrue(new Chance(1, 3).probability() < new Chance(1, 2).probability());
    }

    @Test
    public void testThatTheProbabilityOfOneChanceIncreasesAsTheDenominatorDecreasesAndTheNumeratorsAreTheSame() throws Exception {
        assertTrue(new Chance(2, 7).probability() < new Chance(2, 5).probability());
    }

    @Test
    public void testThatTheProbabilityOfOneChanceIncreaseAsTheTotalNumberOfPossibleOutcomesDecreaseIsFalse() throws Exception {
        assertFalse(new Chance(2, 5).probability() < new Chance(2, 7).probability());
    }



    //need to think about more senarios about what happens with probability

    //    @Test
//    public void testThatChanceHasAProbabilityPercentage() throws Exception {
//        assertNotNull(new Chance(2,3).probabilityPercentage());
//
//
    //testing this change in git
}
