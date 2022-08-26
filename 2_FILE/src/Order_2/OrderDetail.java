package Order_2;

public class OrderDetail {
	private int quatily;
	private Product product;
	public OrderDetail(Product p, int x) {
		product = p;
		setQuatily(x);
	}
	public int getQuatily() {
		return quatily;
	}
	public void setQuatily(int quatily) {
		this.quatily = quatily;
	}
	public double calcTotalPrice() {
		return quatily*product.getPrice();
	}
	public String toString() {
		return String.format("%10s %10s", quatily , calcTotalPrice());
	}
	public void add(OrderDetail orderDetail) {
		
	}
}
