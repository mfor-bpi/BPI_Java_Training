package ph.com.bpi.m3.act1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3Activity1 {

	public static void main(String[] args) {

		List<String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		// Initial list of products
		System.out.println("Product list:");
		listProducts(products);
		
		// Add and remove a product
		products.add("Webcam");
		products.remove("Mouse");
		
		// Updated list of products
		System.out.println("\nProduct list after adding and removing products:");
		listProducts(products);

		// Search for a product
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter product name to search: ");
		String searchProduct = scanner.nextLine();
		
		// Traditional for-loop
		System.out.println("\nResult using traditional for-loop:");
		boolean found = false;
		for (String product : products) {
		    if (product.equalsIgnoreCase(searchProduct)) {
		        found = true;
		        break;
		    }
		}
		if (found) {
		    System.out.println("Product found: " + searchProduct);
		} else {
		    System.out.println(searchProduct + " not found");
		}
		
		// Contains() method
		System.out.println("\nResult using contains() method:");
		if (products.contains(searchProduct)) {
		    System.out.println("Product found: " + searchProduct);
		} else {
		    System.out.println(searchProduct + " not found");
		           }
		
		scanner.close();
		
	}

	private static void listProducts(List<String> products) {
		for (int i = 0; i < products.size(); i++) {
			System.out.printf("%d. %s%n", i + 1, products.get(i));
		}
		
	}

}
