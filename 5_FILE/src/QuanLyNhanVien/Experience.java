package QuanLyNhanVien;

import java.util.Scanner;

public class Experience extends Employee {
	private int ExplnTear;
	private String ProSkill;

	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Experience(String iD, String fullName, String email, String phone, Date brithday, int employee_type,
			int explnYear, String ProSkill) {
		super(iD, fullName, email, phone, brithday, employee_type);
		this.ExplnTear = explnYear;
		this.ProSkill = ProSkill;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
		System.out.print("nhap so nam kinh nghiem: ");
		this.ExplnTear = sc.nextInt();
		sc.nextLine();
		System.out.print("nhap ky nang chuyen mon: ");
		this.ProSkill = sc.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Experience: " + super.toString() + ", ExplYear=" + ExplnTear + ", ProSkill=" + ProSkill;
	}

}
