package xmlHandlers;

import java.util.ArrayList;
import java.util.List;

import restaurant.Order;

public class Reservation {
	
	private List<Order> orders = new ArrayList<>();

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
