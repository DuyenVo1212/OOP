package BT11_SinhVienDHCN;

import java.util.Scanner;

public class Student {
	Scanner sc=new Scanner(System.in);
	private int age;
	private String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Nhap() {
		System.out.println("Nhap ten");
		name=sc.nextLine();
		System.out.println("Nhap tuoi");
		age=sc.nextInt();
		}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
