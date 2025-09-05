package collectionsDemo;

import java.util.Comparator;

public class prodIDComparator implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2) {
		return Integer.compare(o1.getProdId(), o2.getProdId());
	}

}
