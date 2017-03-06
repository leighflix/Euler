
/* 2520 is the smallest number that can be divided by each of 
 * the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible 
 * by all of the numbers from 1 to 20?
 */

public class Problem5 {
	public static void main (String... args) {
		
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (isDivisibleByRangeOf(i, 1, 20)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isDivisibleByRangeOf(int number, int lower, int higher) {
		for (int i = lower; i < higher; i++) {
			if (number % i != 0) return false;
		}
		
		return true;
	}
}
