package Base25.week5.lesson10;

import java.util.Comparator;

public class PriceSortProduct implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
