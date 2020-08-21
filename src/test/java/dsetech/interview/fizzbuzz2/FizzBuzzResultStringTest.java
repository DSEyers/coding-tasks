package dsetech.interview.fizzbuzz2;

import dsetech.interview.fuzzbuzz2.FizzBuzzResultString;
import org.junit.Assert;


public class FizzBuzzResultStringTest {

    // @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals(FizzBuzzResultString.FIZZBUZZ_FIZZ, FizzBuzzResultString.getResultForNumber(3));
    }

    // @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals(FizzBuzzResultString.FIZZBUZZ_BUZZ, FizzBuzzResultString.getResultForNumber(5));
        Assert.assertEquals(FizzBuzzResultString.FIZZBUZZ_BUZZ, FizzBuzzResultString.getResultForNumber(10));
    }

    // @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals(FizzBuzzResultString.FIZZBUZZ_FIZZ + FizzBuzzResultString.FIZZBUZZ_BUZZ, FizzBuzzResultString.getResultForNumber(15));
        Assert.assertEquals(FizzBuzzResultString.FIZZBUZZ_FIZZ + FizzBuzzResultString.FIZZBUZZ_BUZZ, FizzBuzzResultString.getResultForNumber(30));
    }

    // @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzzResultString.getResultForNumber(1));
        Assert.assertEquals("2", FizzBuzzResultString.getResultForNumber(2));
        Assert.assertEquals("4", FizzBuzzResultString.getResultForNumber(4));
    }
}