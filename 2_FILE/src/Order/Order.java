package Order;

import java.time.LocalDate;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Order(int orderID, LocalDate orderDate) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
	}
	public void AddLineItem(Product p, int x) {
		setCount(0);
		setLineItems(new OrderDetail[100]);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public OrderDetail[] getLineItems() {
		return lineItems;
	}
	public void setLineItems(OrderDetail[] lineItems) {
		this.lineItems = lineItems;
	}
}
