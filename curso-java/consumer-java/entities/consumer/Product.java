package entities.consumer;

public class Product {
	private String name;
	private Double price;
	public static Double dezporcento = 1.1;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	public static void naoStaticPriceUpdate(Product p) {
		p.setPrice(p.getPrice()* dezporcento);
	}
	
	public  void  PriceUpdate() {
		price = price * dezporcento;  
	}
	
}