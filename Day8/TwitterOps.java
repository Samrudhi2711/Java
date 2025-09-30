package streamOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwitterOps {

	public static void main(String[] args) {
		System.out.println("Populating Randon Twitter Array ");
		List<Tweet> list = new ArrayList<>();
		Set<String> hashTags = new TreeSet<>();
		hashTags.add("#Pune");
		hashTags.add("#Maharastra");
		hashTags.add("#India");
		Date d = new Date();
		list.add(new Tweet("Welcome to Pune!", d, 1000, hashTags));
		d = new Date(2025, 8, 1);
		list.add(new Tweet("Welcome to CDAC!", d, 10000, Set.of("#Govt Of India", "#Training & Development")));
		d = new Date(2024, 3, 2);
		list.add(new Tweet("India Won World Cup!", d, 10000000, Set.of("#Cricket", "#World Cup")));
		d = new Date(2023, 3, 2);
		list.add(new Tweet("Welcome to India!", d, 100000, Set.of("#India", "#Diversity", "#Food", "#Dress")));
		d = new Date(2020, 2, 25);
		list.add(new Tweet("Start of Covid!", d, 10000000,
				Set.of("#Covid", "#India", "#Pandemic", "#Disease", "#China")));
		d = new Date(2023, 4, 19);
		list.add(new Tweet("Ban of 2000 rupees notes!", d, 1000000000,
				Set.of("#2000 Note", "#India", "#Digital Currency", "#UPI")));
		list.add(new Tweet("Welcome to CDAC!", d, 10000, Set.of("#Govt Of India", "#Training & Development")));
		
		System.out.println("*****1. List all the tweets that are posted in current month*****");
		Stream<Tweet> stream = list.stream();
		stream.filter((s) -> s.getDate().getMonth() == 8 && s.getDate().getYear() == 2025).forEach(System.out::println); 
		
		System.out.println("*****2. List all the tweets for a perticular hashtag*****");
		stream = list.stream();
		stream.filter((s) -> s.getHashTags().contains("#India")).forEach(System.out::println);  
		
		
		System.out.println("*****3. Count the tweets by Subject*****");
		stream = list.stream();
		Map<String, List<Tweet>> subjectTweets = stream.collect(Collectors.groupingBy(Tweet::getSubject));
		subjectTweets.forEach((k, v) -> System.out.println(k + " Count: " + v.size() + " == " + v));
		
		
		System.out.println("*****4. List the tweets that got more than 10k views*****");
		stream = list.stream();
		stream.filter((s) -> s.getNoViews() > 10000).forEach(System.out::println);
		
		
		System.out.println("*****5. Print the top 5 trending tweets*****");
		stream = list.stream();
		Comparator<Tweet> tViewCt = Comparator.comparingInt(Tweet::getNoViews).reversed();
		stream.sorted(tViewCt).limit(5).forEach(System.out::println);

	}

}
