
/* A palindromic number reads the same both ways. The largest 
 * palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {
	public static void main (String... args) {
		System.out.println(largestPalindrome());
	}
	
	public static long largestPalindrome () {
		int max = -1;
		
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int product = i * j;
				if (isPalindrome(i * j) && (product > max)) 
					max = product;
			}
		}
		
		return max;
	}
	
	public static boolean isPalindrome (int number) {
		return new StringBuilder(String.valueOf(number))
			.reverse()
			.toString()
			.equals(String.valueOf(number));
	}
}
