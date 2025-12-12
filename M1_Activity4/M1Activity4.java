/**
 * 
 */
package ph.com.bpi.m1.act4;

/**
 * 
 */

import java.util.Scanner;

public class M1Activity4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		
		int age = scanner.nextInt();
		
		if (age < 18) {
			System.out.println("Minor");
		} else if (age >= 18 && age <= 59) {
			System.out.println("Adult");
		} else if (age >= 60) {
			System.out.println("Senior");
		} 
			
		scanner.close();

	}

}
