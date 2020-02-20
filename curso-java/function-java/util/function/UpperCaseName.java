package util.function;

import java.util.function.Function;

import entities.lambda.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
