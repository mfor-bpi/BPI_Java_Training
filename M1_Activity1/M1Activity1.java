/**
 * 
 */
package ph.com.bpi.m1.act1;

/**
 * 
 */

import java.util.Scanner;

public class M1Activity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is you name? ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "!");
		
		scanner.close();

	}

}
