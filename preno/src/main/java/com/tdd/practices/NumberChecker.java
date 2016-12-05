package com.tdd.practices;

/**
 * @author ash189
 *
 */
public class NumberChecker {

	/**
	 * @param number
	 * @return
	 */
	public boolean isPerfectNumber(int number) {
		boolean isPerfect = false;
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number) {
			System.out.println(number);
			isPerfect = true;
		} else {
			/* System.out.println("It is not a perfect number"); */
			isPerfect = false;
		}
		return isPerfect;
	}

	public static void main(String a[]) {
		NumberChecker ipn = new NumberChecker();
		for (int i = 1; i < 100000; i++) {
			ipn.isPerfectNumber(i);
		}

	}
}
