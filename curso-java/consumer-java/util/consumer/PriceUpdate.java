package util.consumer;

import java.util.function.Consumer;

import entities.consumer.Product;

public class PriceUpdate implements Consumer<Product >{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice()* 1.1);
	}

}
