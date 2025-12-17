package ph.com.bpi.m3.act3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class M3Activity3 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Map<String, Integer> productsMap = new HashMap<>();
		productsMap.put("Laptop", 60000);
		productsMap.put("Mouse", 2000);
		productsMap.put("Keyboard", 5000);
		productsMap.put("Monitor", 12000);
		productsMap.put("Printer", 4500);
		menu(productsMap);		
		scanner.close();
	}
	
	public static void menu(Map<String, Integer> productsMap) {
		System.out.println("\nSelect an option");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
        System.out.print("> ");
		options(productsMap);
	}
	
	public static void options(Map<String, Integer> productsMap) {
		int option = scanner.nextInt();
		scanner.nextLine();
		switch(option) {
			// Search a product
			case 1:
				System.out.print("Enter product name to search: ");	
				String searchName = scanner.nextLine();
				search(productsMap, searchName);
				menu(productsMap);
				break;
			// Add a product 
			case 2:
				System.out.print("Enter product name to add: ");
				String addName = scanner.nextLine();
				System.out.print("Enter product value: ");
				int addPrice = scanner.nextInt();
				add(productsMap, addName, addPrice);
				menu(productsMap);
				break;
			// Print all products and price
			case 3:
				System.out.println("\nAll products and prices:");
				print(productsMap);
				menu(productsMap);
				break;
			// Find the cheapest product
			case 4:
				findCheapest(productsMap);
				menu(productsMap);
				break;
			// Exit
			case 5:
				System.out.println("\nExiting...");
				break;
            // Invalid option   
            default:
            	System.out.println("Not in the options! Please try again!");
		}
	}
	
	public static void search(Map<String, Integer> productsMap, String name) {
		boolean found = false;
		for (Map.Entry<String, Integer> entry : productsMap.entrySet()){
			if(entry.getKey().equals(name)) {
				System.out.println("Product found! Price: " + entry.getValue());
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Product not found!");
		}
	}
	
	public static void add(Map<String, Integer> products, String name, int price) {
		products.put(name, price);
		System.out.println("Product added: " + name);
	}
	
	public static void print(Map<String, Integer> productsMap) {
		for (Map.Entry<String, Integer> entry : productsMap.entrySet()){
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("Total products: " + productsMap.size());
	}
	
	public static void findCheapest(Map<String, Integer> productsMap) {
		String cheapestKey = null;
		int cheapestValue = Integer.MAX_VALUE;
		for (Map.Entry<String, Integer> entry : productsMap.entrySet()){
			if(entry.getValue() < cheapestValue) {
				cheapestKey = entry.getKey();
				cheapestValue = entry.getValue();
			}
		}
		System.out.println("Cheapest product: " + cheapestKey + " - " + cheapestValue);
	}
	
}
