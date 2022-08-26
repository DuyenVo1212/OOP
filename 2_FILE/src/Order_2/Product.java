package Order_2;

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
	public Product() {
		
	}
	public Product(String description, String productID, double price) {
		setDescription(description);
		setProductID(productID);
		setPrice(price);
	}
	public String toString() {
		return String.format("%10s %10s %10s",
				description, productID, price);
	}
}
