package Order_2;

import java.time.LocalDate;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private Product pd;
	private int count = 0;
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
		setOrderID(orderID);
		setOrderDate(orderDate);
	}
	public void addLineItem(Product p, int x) {;
		
	}
	public int sigma(){
        int sum = 0;
        for (int i = 0; i <= count; i++) {
            sum += pd.getPrice();
        }
        return sum;
    }
	public double calcTotalCharge() {
		return sigma();
	}
	public String toString() {
		return String.format("%10s %10s %10s",
				count, orderID, orderDate);
	}
	public OrderDetail[] getLineItems() {
		return lineItems;
	}
	public void setLineItems(OrderDetail[] lineItems) {
		this.lineItems = lineItems;
	}
}
