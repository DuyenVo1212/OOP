package Order;

public class Product {
	private String description;
	private String productID;
	private double price;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String description, String productID, double price) {
		super();
		this.description = description;
		this.productID = productID;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("%-10s %-10s %-10.2f", description, productID, price);
	}
}
