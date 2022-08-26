package B_PERSON;

public class Employee extends Person{
	private int salary;
	private int review;
	public Employee(String fullname, String address, int salary, int review) {
		super(fullname, address);
		this.salary = salary;
		this.review = review;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String fullname, String address) {
		super(fullname, address);
		// TODO Auto-generated constructor stub
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public double Tinhluong() {
		return 2000*salary;
	}
	public static Employee inputEmployee() {
		String fullname=Input.inputString("Nhap full ten");
		int review=Input.inputInt("Nhap review");
		String address =Input.inputString("Nhap dia chi");
		int salary=Input.inputInt("Nhap salary");
		return new Employee(fullname, address, salary, review);
	}
	@Override
	public String toString() {
		return "Employee" +super.toString()+ "salary=" + salary + "review=" + review + ", Tinhluong()=" + Tinhluong() + "]";
	}
	
	
	
	
}
