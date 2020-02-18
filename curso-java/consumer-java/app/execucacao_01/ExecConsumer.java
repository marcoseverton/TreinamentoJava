package app.execucacao_01;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.consumer.Product;
import util.consumer.PriceUpdate;

public class ExecConsumer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//list.forEach(new PriceUpdate());
		
		//list.forEach(Product::staticPriceUpdate);
		
		//list.forEach(Product::naoStaticPriceUpdate);
		
		/*
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice()* Product.dezporcento);
		};
		
		list.forEach(cons);
		*/
		
		list.forEach(p->p.setPrice(p.getPrice()* Product.dezporcento));
		
		list.forEach(System.out::println);

	}

}
