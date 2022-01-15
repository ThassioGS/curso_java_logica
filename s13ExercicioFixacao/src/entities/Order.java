package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private String moment;
	private OrderStatus status;

	private List<OrderItem> item = new ArrayList<>();

	public Order() {
	}

	public Order(String moment, String status) {
		this.moment = moment;
		this.status = OrderStatus.valueOf(status);
	}

	public void addItem(OrderItem items) {
		item.add(items);
	}

	public void removeItem(OrderItem items) {
		item.remove(items);
	}

	public Double total() {
		double sum = 0;
		for (@SuppressWarnings("unused")
		var i : item) {
			sum += ((OrderItem) item).subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + moment + "\n");
		sb.append("Order status: " + status + "\n");
		return sb.toString();
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
