package commons;

public class Math {
	
	public static boolean IsPrime(int number) {
		if (number <= 1 || number == 2 || number % 2 == 0) {
			return false;
		} else {
			return _isPrime(number);
		}
	}
	
    public static boolean IsPrime(long number) {
        if (number <= 1 || number == 2 || number % 2 == 0) {
            return false;
        } else {
            return _isPrime(number);
        }
    }	
	
	private static boolean _isPrime(int number) {
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) return false;
		}
		return true;
	}
	
    private static boolean _isPrime(long number) {
        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    public static int log10(int base) {
    	int resultado = 1;
    	for (int i = 0; i < base; i++) {
    		resultado *= 10;
    	}
    	return resultado;
    }

}
