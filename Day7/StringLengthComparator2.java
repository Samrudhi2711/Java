package lamdas;

import java.util.Comparator;

public class StringLengthComparator2 implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s2.length(), s1.length());
	}

}
