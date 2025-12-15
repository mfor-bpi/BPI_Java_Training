package ph.com.bpi.m3.act2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class M3Activity2 {

	public static void main(String[] args) {
		
        Set<String> products = new HashSet<>();

		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Search a product");
            System.out.println("2. Add a product");
            System.out.println("3. Print all products and count");
            System.out.println("4. Exit");
            System.out.print("> ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
            
            	// Search a product
                case 1:
                    System.out.print("Enter product name to search: ");
                    String searchProduct = scanner.nextLine();
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
                        System.out.println("Product not found");
                    }
                    break;

                // Add a product    
                case 2:
                    System.out.print("Enter product name to add: ");
                    String newProduct = scanner.nextLine();
                    if (products.add(newProduct)) {
                        System.out.println("Product added: " + newProduct);
                    } else {
                        System.out.println("Product already exists.");
                    }
                    break;

                // Print all products and count
                case 3:
                    System.out.println("All products:");
                    for (String product : products) {
                    	System.out.println(product);
                    }
                    System.out.println("Total unique products: " + products.size());
                    break;

                // Exit    
                case 4:
                    System.out.println("\nExiting...");
                    break;

                // Invalid option   
                default:
                    System.out.println("Not in the options! Please try again!");
            }
        } 
        while (option != 4);

        scanner.close();
        
	}

}
