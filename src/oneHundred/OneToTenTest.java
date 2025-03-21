package oneHundred;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class OneToTenTest {

	@Test
	void testProblem001Base() {
		// Arrange
		long want = 23L;
		// Act
		long get = OneToTen.problem001(10);
		
		// Assert
		assertEquals(want, get);
	}
	
	@Test
	void testProblem001Final() {
		long want = 233168L;
		long get = OneToTen.problem001(1_000);
		assertEquals(want, get);
	}
	
	@Test
	void testProblem002Base() {
		int expected = 44;
		int actual = OneToTen.problem002(89);
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem002Final() {
		int expected = 4_613_732;
		int actual = OneToTen.problem002(4_000_000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem003Base() {
		int number = 13_195;
		int expected = 29;
		
		int actual = OneToTen.problem003(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem003Final() {
		long number = 600_851_475_143L;
		long expected = 6857L;
		
		long actual = OneToTen.problem003(number);
		
		assertEquals(expected, actual);
	}

    @ParameterizedTest
    @CsvSource({
        "2, 9009",
        "3, 906609",
    })
    void testProblem004(int base, int expected) {
        int actual = OneToTen.problem004(base);
        assertEquals(expected, actual);
    }
}
