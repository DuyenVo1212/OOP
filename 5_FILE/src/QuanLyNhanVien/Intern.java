package QuanLyNhanVien;

import java.util.Scanner;

public class Intern extends Employee {
	private String Majors, University_name;
	private int Semester;

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(String iD, String fullName, String email, String phone, Date brithday, int employee_type,
			String majors, int semester, String university_name) {
		super(iD, fullName, email, phone, brithday, employee_type);
		this.Majors = majors;
		this.Semester = semester;
		this.University_name = university_name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
		System.out.print("nhap chuyen nganh dang hoc: ");
		this.Majors = sc.nextLine();
		System.out.print("nhap hoc ky dang hoc: ");
		this.Semester = sc.nextInt();
		sc.nextLine();
		System.out.print("nhap ten truong dang hoc: ");
		this.University_name = sc.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Inter: " + super.toString() + ", Majors=" + Majors + ", Semester=" + Semester + ", University_name="
				+ University_name;
	}

}
