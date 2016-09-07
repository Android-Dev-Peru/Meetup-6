package demo 

import org.junit.Assert
import kotlin.test.assertEquals
import org.junit.Test

class TestSource {

    @Test
    fun getResultShouldReturnFizzIfTheNumberIsDividableBy3(){
        Assert.assertEquals("fizz", FizzBuzz().getResult(3))
    }

    @Test
    fun getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals("buzz", FizzBuzz().getResult(5))
        Assert.assertEquals("buzz", FizzBuzz().getResult(10))
    }

    @Test
    fun getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals("fizzbuzz", FizzBuzz().getResult(15))
        Assert.assertEquals("fizzbuzz", FizzBuzz().getResult(30))
    }

    @Test
    fun getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz().getResult(1))
        Assert.assertEquals("2", FizzBuzz().getResult(2))
        Assert.assertEquals("4", FizzBuzz().getResult(4))
    }
}
