package Hodsdon.Ben.Chapter7.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		
		SimpleMath simpleMath = new SimpleMath();
		assertEquals(0, simpleMath.divide(0, 7), 0.0001);
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		
		SimpleMath simpleMath = new SimpleMath();
		assertEquals(0.25, simpleMath.divide(1, 4), 0.0001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		
		SimpleMath simpleMath = new SimpleMath();
		simpleMath.divide(6, 0);
	}
}
