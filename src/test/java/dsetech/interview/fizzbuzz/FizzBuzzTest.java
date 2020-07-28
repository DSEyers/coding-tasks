package test.java.fizzbuzz;

import main.java.fuzzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import static main.java.fuzzbuzz.Constants.*;

public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals(FIZZBUZZ.FIZZ, FizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals(FIZZBUZZ.BUZZ, FizzBuzz.getResult(5));
        Assert.assertEquals(FIZZBUZZ.BUZZ, FizzBuzz.getResult(10));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals(String.valueOf(FIZZBUZZ.FIZZ) + FIZZBUZZ.BUZZ, FizzBuzz.getResult(15));
        Assert.assertEquals(String.valueOf(FIZZBUZZ.FIZZ) + FIZZBUZZ.BUZZ, FizzBuzz.getResult(30));
    }

    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
        Assert.assertEquals("2", FizzBuzz.getResult(2));
        Assert.assertEquals("4", FizzBuzz.getResult(4));
    }
}