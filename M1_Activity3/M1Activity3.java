/**
 * 
 */
package ph.com.bpi.m1.act3;

/**
 * 
 */

import java.util.Scanner;

public class M1Activity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = scanner.nextInt();
		
		int sumInt = num1 + num2;
		
		int diffInt = num1 - num2;
		
		int prodInt = num1 * num2;
		
		System.out.println("Sum: " + sumInt);
		
		System.out.println("Difference: " + diffInt);
		
		System.out.println("Product: " + prodInt);
		
		scanner.close();


	}

}
