package B_PERSON;

public class Customer extends Person{
	private String namecompany;
	private int invoice;
	private int review;
	public Customer(String fullname, String address, String namecompany, int invoice, int review) {
		super(fullname, address);
		this.namecompany = namecompany;
		this.invoice = invoice;
		this.review = review;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String fullname, String address) {
		super(fullname, address);
		// TODO Auto-generated constructor stub
	}
	public String getNamecompany() {
		return namecompany;
	}
	public void setNamecompany(String namecompany) {
		this.namecompany = namecompany;
	}
	public int getInvoice() {
		return invoice;
	}
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public static Customer inputCustomer() {
		String fullname=Input.inputString("Nhap full ten");
		int review=Input.inputInt("Nhap review");
		String address =Input.inputString("Nhap dia chi");
		String namecompany =Input.inputString("Nhap ten cong ty");
		int invoice=Input.inputInt("Nhap invoice");
		return new Customer(fullname, address, namecompany, invoice, review);
	}
	@Override
	public String toString() {
		return "Customer"+super.toString()+"namecompany=" + namecompany + ", invoice=" + invoice + ", review=" + review + "]";
	}
	
}
