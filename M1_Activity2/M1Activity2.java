/**
 * 
 */
package ph.com.bpi.m1.act2;

/**
 * 
 */

import java.util.Scanner;

public class M1Activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		
		int ageInt = scanner.nextInt();
		System.out.println("Your age as int: " + ageInt);
		
		double ageDouble = (double) ageInt;
		System.out.println("Your age as double: " + ageDouble );
		
		scanner.close();

	}

}
