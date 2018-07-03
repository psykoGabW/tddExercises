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
}
