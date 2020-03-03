package app_lambda_02;
import java.util.ArrayList;
import java.util.List;
import entities.lambda.Product;

public class ExecLbd_02 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);
		
		/*
		 * outras alternativas:
		 * 
		 - list.removeIf(new ProductPredicate()); 
		 OU 
		 - list.removeIf(Product::staticProductPredicate);
		 * */

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
