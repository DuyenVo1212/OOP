package QuanLyNhanVien;

import java.util.Scanner;

public class Fresher extends Employee {
	private Date graduation_date = new Date();
	private String Graduation_rank, Education;

	public Fresher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fresher(String iD, String fullName, String email, String phone, Date brithday, int employee_type,
			Date graduation_date, String graduation_rank, String education) {
		super(iD, fullName, email, phone, brithday, employee_type);
		this.graduation_date = graduation_date;
		this.Graduation_rank = graduation_rank;
		this.Education = education;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
		System.out.println("nhap thoi gian tot nghiep: ");
		this.graduation_date.nhap();
		System.out.print("nhap xep loai tot nghiep: ");
		this.Graduation_rank = sc.nextLine();
		System.out.print("nhap truong tot nghiep: ");
		this.Education = sc.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fresher: " + super.toString() + ", Graduation_date=" + graduation_date + ", Graduation_rank="
				+ Graduation_rank + ", Education=" + Education;
	}

}
