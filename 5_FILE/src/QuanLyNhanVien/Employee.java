package QuanLyNhanVien;

import java.util.Scanner;

public class Employee {
	protected String ID, FullName, Email, Phone;
	protected Date Brithday = new Date();
	protected int Employee_type;
	protected ListCertificate DSbangCap = new ListCertificate();

	public String getID() {
		return ID;
	}

	public int getEmployee_type() {
		return Employee_type;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String iD, String fullName, String email, String phone, Date brithday, int employee_type) {
		super();
		ID = iD;
		FullName = fullName;
		Email = email;
		Phone = phone;
		Brithday = brithday;
		Employee_type = employee_type;
	}

	public void nhap(Scanner sc) {
		System.out.print("Nhap ID: ");
		this.ID = sc.nextLine();
		System.out.print("Nhap FullName: ");
		this.FullName = sc.nextLine();
		System.out.print("Nhap Email: ");
		this.Email = sc.nextLine();
		System.out.print("Nhap Phone:");
		this.Phone = sc.nextLine();
		System.out.println("Nhap Birthday:");
		this.Brithday.nhap();
		System.out.print("Nhap Employee Type: 0.experience 1.fresher 2.intern ");
		this.Employee_type = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap so bang cap muon nhap:");
		int sbc = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < sbc; i++) {
			System.out.println("nhap bang cap thu " + i + 1 + " :");
			this.DSbangCap.them(sc);
		}

	}

	@Override
	public String toString() {
		String typeString = "";
		if (String.valueOf(getEmployee_type()).equalsIgnoreCase("Experience")) {
			typeString = "0";
		} else if (String.valueOf(getEmployee_type()).equalsIgnoreCase("Intern")) {
			typeString = "2";
		} else if (String.valueOf(getEmployee_type()).equalsIgnoreCase("Fresher" + "")) {
			typeString = "1";
		}
		return "ID=" + ID + ", FullName=" + FullName + ", Email=" + Email + ", Phone=" + Phone + ", Brithday="
				+ Brithday.toString() + ", Employee_type=" + typeString + "ListCertificate=" + this.DSbangCap.xuat();
	}

}
