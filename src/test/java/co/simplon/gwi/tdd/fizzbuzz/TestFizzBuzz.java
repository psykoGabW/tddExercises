package co.simplon.gwi.tdd.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFizzBuzz {
	@Test(expected = IllegalArgumentException.class)
	public void shouldReturnAnIllegalArgumentExceptionIfMinIsSuperiorToMax() {
	    FizzBuzz.fizzBuzz(3, 2);
	}
	
	@Test
	public void shouldReturnMinIfMinAndMaxAreTheSame()
	{
		assertEquals("2", FizzBuzz.fizzBuzz(2, 2));		
	}
	
	@Test
	public void shouldReturnFizzIfDivisibleBy3() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3));
	}
	
	@Test
	public void shouldReturnBuzzIfDivisibleBy5() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 5));
	}
	
	@Test
	public void shouldReturnFizzBuzzIfDivisibleBy15() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 15));
	}
	
	@Test
	public void shouldReturnMultipleNumberBetweenMinAndMax() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", FizzBuzz.fizzBuzz(1, 20));
	}
	
}
