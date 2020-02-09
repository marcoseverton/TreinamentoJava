package testedoPrograma;

import java.util.Date;

import entities.Order;
import entities.enuns.OrderStatus;

public class Programa {
	
	public static void main (String [] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		//convertendo tipo enum em string
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}

}
