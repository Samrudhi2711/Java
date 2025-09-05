package collectionsDemo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Stock {

	public static void listToys(List<Toy> toys) {
		for (Toy toy : toys) {
			System.out.println(toy);
		}

	}

	public static List<Toy> getListByCategory(List<Toy> toys, String category) {
		List<Toy> filteredToys = new ArrayList<>();
		for (Toy toy : toys) {
			if (toy.getCategory().equals(category))
				filteredToys.add(toy);
		}

		return filteredToys;

	}

	public static List<Toy> getListByPriceRange(List<Toy> toys, double low, double high) {
		List<Toy> filteredToys = new ArrayList<>();
		for (Toy toy : toys) {
			if (toy.getPrice() >= low && toy.getPrice() <= high)
				filteredToys.add(toy);
		}

		return filteredToys;

	}

	public static List<Toy> getListByAge(List<Toy> toys, int age) {
		List<Toy> filteredToys = new ArrayList<>();
		for (Toy toy : toys) {
			if (toy.getAge() >= age)
				filteredToys.add(toy);
		}

		return filteredToys;

	}

	public static List<Toy> getOlderStock(List<Toy> toys, int years) {
		List<Toy> filteredToys = new ArrayList<>();
		Date d1 = new Date();
		Date d2 = new Date();
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.DAY_OF_MONTH, 1);
		for (Toy toy : toys) {
			c2.set(Calendar.YEAR, toy.getPurchase_year()); // Set the full year
			c2.set(Calendar.MONTH, toy.getPurchase_month() - 1); // Month is 0-indexed (August is 7)
			d2 = new Date(c2.getTimeInMillis());
			long difference_In_Time = d1.getTime() - d2.getTime();
			long diffInDays = TimeUnit.MILLISECONDS.toDays(difference_In_Time);
			if (diffInDays >= years * 365)
				filteredToys.add(toy);
		}

		return filteredToys;

	}

	public static Map<Integer, String> getGroupToys(List<Toy> toys, String category) {
		Map<Integer, String> result = new HashMap<>();
		for (Toy toy : toys) {
			if (toy.getCategory().equals(category))
				result.put(toy.getProdId(), category);
		}
		return result;

	}

}
