package Display;

public class HienThi {
	private String name;
	private int age;
	public HienThi(String name, int age) {
		setName(name);
		setAge(age);
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
