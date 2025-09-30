package streamOperations;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToyOps {

	public static void main(String[] args) {
		List<Toy> toys = new ArrayList<>();
		toys.add(new Toy(100, "Bus", 500, "Transport", 5, 8, 2024));
		toys.add(new Toy(201, "Car", 300, "Transport", 3, 8, 2023));
		toys.add(new Toy(105, "Plate", 50, "Cooking", 1, 8, 2025));
		toys.add(new Toy(206, "Spoon", 100, "Cooking", 1, 1, 2025));
		toys.add(new Toy(107, "Drone", 5000, "EduTech", 18, 1, 2025));
		toys.add(new Toy(108, "1000 piece Puzzle", 100, "EduTech", 18, 1, 2021));
		toys.add(new Toy(110, "BP Check", 200, "Medical", 6, 1, 2021));
		toys.add(new Toy(111, "stethoscope", 600, "Medical", 6, 1, 2022));
		toys.add(new Toy(115, "TermoMeter", 600, "Medical", 6, 1, 2022));
		System.out.println("******1. List the Stock*******");
		Stream<Toy> stream = toys.stream();
		stream.forEach(System.out::println);

		System.out.println("******2. Filter the stock by category:Transport*******");
		stream = toys.stream();
		stream.filter(s -> s.getCategory().equals("Transport")).forEach(System.out::println);

		System.out.println("******3. List Toys by price range (e.g. between 500 to 1000)**********");
		stream = toys.stream();
		stream.filter(s -> (s.getPrice() >= 500 && s.getPrice() <= 1000)).forEach(System.out::println);

		System.out.println("*****4. Sort the toys by price- category wise*****");
		Comparator cPriceCategory = Comparator.comparingDouble(Toy::getPrice).thenComparing(Toy::getCategory);
		stream = toys.stream();
		stream.sorted(cPriceCategory).forEach(System.out::println);

		System.out.println("*****5. Make the list of old stock [older than 1 year]*****");
		int years = 1;
		Predicate<Toy> pDaysOld = (t) -> {
			Date d1 = new Date();
			Date d2 = new Date();
			Calendar c2 = Calendar.getInstance();
			c2.set(Calendar.DAY_OF_MONTH, 1);
			c2.set(Calendar.YEAR, t.getPurchase_year()); // Set the full year
			c2.set(Calendar.MONTH, t.getPurchase_month() - 1); // Month is 0-indexed (August is 7)
			d2 = new Date(c2.getTimeInMillis());
			long difference_In_Time = d1.getTime() - d2.getTime();
			long diffInDays = TimeUnit.MILLISECONDS.toDays(difference_In_Time);
			if (diffInDays >= years * 365)
				return true;
			else
				return false;
		};
		stream = toys.stream();
		stream.filter(pDaysOld).forEach(System.out::println);
		System.out.println("*****6. Make a group of toys as per their category, count them*****");
		stream = toys.stream();
		Map<String, List<Toy>> CategorizedToys = stream.collect(Collectors.groupingBy(Toy::getCategory));
		CategorizedToys.forEach((k, v) -> System.out.println(k + " Count: " + v.size() + " == " + v));

		System.out.println("*****7. Display the most expensive/least expensive toy in given category*****");
		stream = toys.stream();
		Map<String, Optional<Toy>> CategorizedToysWithMaxPrice = stream.collect(
				Collectors.groupingBy(Toy::getCategory, Collectors.maxBy(Comparator.comparing(Toy::getPrice))));
		CategorizedToysWithMaxPrice.forEach((k, v) -> System.out.println(k + " Max Price Toy: " + " == " + v));
		System.out.println("*****8. Print total no of toys in stock for each age grp*****");
		stream = toys.stream();
		Map<Integer, List<Toy>> CategorizedToysWithCount = stream.collect(Collectors.groupingBy(Toy::getAge));
		CategorizedToysWithCount
				.forEach((k, v) -> System.out.println(k + " Age Toy: " + " == " + v + "Count:" + v.size()));

	}

}
