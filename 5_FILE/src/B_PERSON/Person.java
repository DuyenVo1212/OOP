package B_PERSON;

public class Person {
	private String fullname;
	private String address;
	public Person(String fullname, String address) {
		super();
		this.fullname = fullname;
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "fullname=" + fullname + ", address=" + address ;
	}
	
}
