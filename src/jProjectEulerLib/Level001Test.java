package jProjectEulerLib;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class Level001Test {

	Level001 level001 = new Level001();

	@Test
	void testProblem001Base() {
		// Arrange
		long want = 23L;
		// Act
		long get = level001.problem001(10);
		
		// Assert
		assertEquals(want, get);
	}
	
	@Test
	void testProblem001Final() {
		long want = 233168L;
		long get = level001.problem001(1_000);
		assertEquals(want, get);
	}
	
	@Test
	void testProblem002Base() {
		int expected = 44;
		int actual = level001.problem002(89);
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem002Final() {
		int expected = 4_613_732;
		int actual = level001.problem002(4_000_000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem003Base() {
		int number = 13_195;
		int expected = 29;
		
		int actual = level001.problem003(number);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testProblem003Final() {
		long number = 600_851_475_143L;
		long expected = 6857L;
		
		long actual = level001.problem003(number);
		
		assertEquals(expected, actual);
	}

    @ParameterizedTest
    @CsvSource({
			"0, 0",
			"1, 9",
			"2, 9009",
			"3, 906609",
    })
    void testProblem004(int base, int want) {
        int get = level001.problem004(base);
        assertEquals(want, get);
    }

	@ParameterizedTest
	@CsvSource({
			"0, 1",
			"10, 2520",
			"20, 232792560"
	})
	void testProblem005(int max, long expected) {
		long actual = level001.problem005(max);
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@CsvSource({
			"10, 2_640",
			"100, 25_164_150"
	})
	void testProblem006(int size, long expected) {
		long actual = level001.problem006(size);
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@CsvSource({
			"6, 13",
			"7, 17",
			"10_001, 104_743"
	})
	void testProblem007(int index, long expected) {
		long actual = level001.problem007(index);
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@CsvSource({
			"4, 5832",
			"13, 23_514_624_000"
	})
	void testProblem008(int index, long expected) {
		long actual = level001.problem008(index);
		assertEquals(expected, actual);
	}
}