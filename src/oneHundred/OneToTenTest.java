package oneHundred;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class OneToTenTest {
	
	OneToTen firstTen = new OneToTen();

	@Test
	void testProblem001Base() {
		// Arrange
		long want = 23L;
		// Act
		long get = firstTen.problem001(10);
		
		// Assert
		assertEquals(want, get);
	}
	
	@Test
	void testProblem001Final() {
		long want = 233168L;
		long get = firstTen.problem001(1_000);
		assertEquals(want, get);
	}
	
	@Test
	void testProblem002Base() {
		int expected = 44;
		int actual = firstTen.problem002(89);
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem002Final() {
		int expected = 4_613_732;
		int actual = firstTen.problem002(4_000_000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem003Base() {
		int number = 13_195;
		int expected = 29;
		
		int actual = firstTen.problem003(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem003Final() {
		long number = 600_851_475_143L;
		long expected = 6857L;
		
		long actual = firstTen.problem003(number);
		
		assertEquals(expected, actual);
		
	}

}
