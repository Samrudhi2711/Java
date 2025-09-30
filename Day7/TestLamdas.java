package lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLamdas {

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if (number == 2)
			return true;
		if (number <= 0)
			return false;
		if (number % 2 == 0)
			return false;
		for (int i = 3; i * i <= number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static List<Integer> operateOnNumbers(Predicate P, List<Integer> list) {
		List<Integer> lists = new ArrayList<>();
		for (Integer i : list) {
			if (P.test(i))
				lists.add(i);
		}
		return lists;

	}

	public static List<String> operateOnStrings(StringsOps S, List<String> list) {
		List<String> lists = new ArrayList<>();
		for (String i : list) {
			if (S.opeateOnString(i))
				lists.add(i);
		}
		return lists;

	}

	public static void main(String[] args) {
		Predicate checkPostiveNo = (n) -> ((n >= 0) ? true : false);
		System.out.println("Entered Number is:5 and Postive is:" + checkPostiveNo.test(5));
		System.out.println("Entered Number is:-5 and Postive is:" + checkPostiveNo.test(-5));
		Predicate isPrime = (n) -> (isPrime(n));
		System.out.println("Entered Number is:2 and IsPrime is:" + isPrime.test(2));
		System.out.println("Entered Number is:0 and IsPrime is:" + isPrime.test(0));
		System.out.println("Entered Number is:101 and IsPrime is:" + isPrime.test(101));
		System.out.println("Entered Number is:-5 and IsPrime is:" + isPrime.test(-5));
		Predicate checkEven = (n) -> ((n % 2 == 0) ? true : false);
		List<Integer> list = Arrays.asList(1, -2, 3, 4, 100, 40, 56, 60);
		System.out.println("Given Array for Checking Even" + list);
		System.out.println("Processed Array for Checking Even:" + operateOnNumbers(checkEven, list));
		Predicate isDivBy2_3_5 = (n) -> ((n % 2 == 0 && n % 3 == 0 && n % 5 == 0) ? true : false);
		System.out.println("Processed Array for Divisible by 2, 3 and 5:" + operateOnNumbers(isDivBy2_3_5, list));
		List<String> words = Arrays.asList("Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon");
		System.out.println("Original words: " + words); // Output: [stream, example]
		List<String> upper = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		List<String> lower = words.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println("Converted UpperCase words: " + upper); // Output: [stream, example]
		System.out.println("Converted LowerCase words: " + lower); // Output: [stream, example]
		int len = 7;
		List<String> lessThan = words.stream().filter(s -> (s.length() < len ? true : false))
				.sorted(new StringLengthComparator()).collect(Collectors.toList());
		System.out.println("Strings Less than 5 characters Arranged in Ascending order: " + lessThan);
		List<String> greaterThan = words.stream().filter(s -> (s.length() < len ? true : false))
				.sorted(new StringLengthComparator2()).collect(Collectors.toList());
		System.out.println("Strings Less than 5 characters Arranged in Descending order: " + greaterThan);
		List<String> startsWithUpper = words.stream().filter(s -> Character.isUpperCase(s.charAt(0))).sorted()
				.collect(Collectors.toList());
		System.out.println("Strings That Start with UpperCase Letter: " + startsWithUpper);
		int y = 6;
		List<String> lessthan6or6 = words.stream().filter(s -> (s.length() <= y ? true : false))
				.sorted(new StringLengthComparator2()).collect(Collectors.toList());
		System.out.println("Strings Less than or equal to 6 alphabets Arranged in Descending order: " + lessthan6or6);
		List<String> lengthWiseSort = words.stream().sorted(new StringLengthComparator()).collect(Collectors.toList());
		System.out.println("Strings Sorted in Ascendng order by Length: " + lengthWiseSort);
	}

}