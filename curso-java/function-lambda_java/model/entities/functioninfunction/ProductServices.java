package model.entities.functioninfunction;

import java.util.List;
import java.util.function.Predicate;
import entities.function_in_function.Product;

public class ProductServices {

	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
