package Order;

public class OrderDetail {
	private int quatily;
	private Product product;
	public int getQuatily() {
		return quatily;
	}
	public void setQuatily(int quatily) {
		this.quatily = quatily;
	}
	public OrderDetail(int quatily, Product product) {
		super();
		this.quatily = quatily;
		this.product = product;
	}
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double calcTotakPrice() {
		double tt = 0;
		tt = quatily*product.getPrice();
		return tt;
	}
	public String toString() {
		return super.toString() + String.format("%-10s %-10s", quatily, calcTotakPrice());
	}
}
