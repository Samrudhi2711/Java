package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StockChecks {

	public static void main(String[] args) {
//Populate the stock
		List<Toy> toys = new ArrayList<>();
		toys.add(new Toy(100, "Bus", 500, "Transport", 5, 8, 2024));
		toys.add(new Toy(201, "Car", 300, "Transport", 3, 8, 2023));
		toys.add(new Toy(105, "Plate", 50, "Cooking", 1, 8, 2025));
		toys.add(new Toy(206, "Spoon", 100, "Cooking", 1, 1, 2025));
		toys.add(new Toy(107, "Drone", 5000, "EduTech", 18, 1, 2025));
		toys.add(new Toy(108, "1000 piece Puzzle", 100, "EduTech", 18, 1, 2021));
		toys.add(new Toy(110, "BP Check", 200, "Medical", 6, 1, 2021));
		toys.add(new Toy(111, "stethoscope", 600, "Medical", 6, 1, 2022));
		System.out.println("******1. List the Stock*******");
		Stock.listToys(toys);
		
		
		System.out.println("******2. Filter the stock by category(Transport)*******");
		Stock.listToys(Stock.getListByCategory(toys, "Transport"));
		
		System.out.println("******3. Filter the stock by category(Cooking)*******");
		Stock.listToys(Stock.getListByCategory(toys, "Cooking"));
		
		
		System.out.println("******Search toy in the list by using binarySearch (with prodid as key)*******");
		Collections.sort(toys);
		
		
		System.out.println("******Sorted Stock by ID*******");
		Stock.listToys(toys);
		
		
		System.out.println("******Binary Search by ID=110*******");
		int found = Collections.binarySearch(toys, new Toy(110, "BP Check", 200, "Medical", 6, 1, 2021));
		System.out.println("Found at :" + found);
		
		
		System.out.println("******4. List Toys by price range between 100 and 500*******");
		Stock.listToys(Stock.getListByPriceRange(toys, 100, 500));
		
		
		System.out.println("******5. List Toys by Age Above 18 *******");
		Stock.listToys(Stock.getListByAge(toys, 18));
		
		
		System.out.println("******6. Sort the toys by price *******");
		Collections.sort(toys, new priceComparator());
		Stock.listToys(toys);
		
		
		System.out.println("******6. Sort the toys by name *******");
		Collections.sort(toys, new nameComparator());
		Stock.listToys(toys);
		
		
		System.out.println("******6. Sort the toys by ID *******");
		Collections.sort(toys, new prodIDComparator());
		Stock.listToys(toys);
		
		
		System.out.println("******7. Make the list of old stock [older than 2 year]*******");
		Stock.listToys(Stock.getOlderStock(toys, 2));
		
		
		System.out.println("******8. Make a group of toys as per their category*******");
		Map<Integer, String> map = Stock.getGroupToys(toys, "EduTech");
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
