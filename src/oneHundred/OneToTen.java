package oneHundred;

import commons.Math;

public class OneToTen {
	
	// commons.Math math = new commons.Math();
	
	public long problem001(int limit) {
		long  sum = 0;
		
		for (int i = 0; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public int problem002(int limit) {
		/*
		 * Even Fibonacci Numbers
		 * Problem 002
		 * 
		 * Each new term in the Fibonacci sequence is generated by
		 * adding the previous two terms. By starting with 1 and
		 * 2, the first 10 terms will be:
		 * 
		 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		 * 
		 * By considering the terms in the Fibonacci sequence
		 * whose values do not exceed four million, find the sum
		 * of the even-valued terms.
		 * 
		 */
		
		int sum = 0;
		int a = 1;
		int b = 1;
		
		while (b < limit) {
			if (b % 2 == 0) {
				sum += b;
			}
			int h = a + b;
			a = b; b = h;
		}
		return sum;
	}
	
	public long problem003(long number) {
		/*
		 * Largest Prime Factor
		 * Problem 003
		 * 
		 * The prime factors of 13_195 are 5, 7, 13 and 29.
		 * What is the largest prime factor of the number 600_851_475_143?
		 * 
		 */
		long largestFactor = 2L;
		
		if (Math.IsPrime(number)) {
			return number;
		}
		
		for (long divisor = 3; divisor * divisor <= number; divisor += 2) {
			if (number % divisor == 0) {
				largestFactor = divisor;
				number /= divisor;
			}
		}
		
		if (number > largestFactor)
			largestFactor = number;
		
		return largestFactor;
	}
	
	public int problem003 (int number) {
		int largestFactor = 2;
		if (Math.IsPrime(number)) return number;
		for (int divisor=3; divisor*divisor<=number; divisor+=2) {
			if (number%divisor==0) {
				largestFactor = divisor; 
				number /= divisor;
			}
		}
		if (number > largestFactor) largestFactor = number;
		return largestFactor;
	}

}
