package Person;

public class Teacher extends Person{
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Teacher(String name, int age, String address, int salary) {
		super(name, age, address);
		this.salary = salary;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
	super.display();
		System.out.println("Salary: "+ salary);
	}
	
}
