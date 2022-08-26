package B_QuanLySinhVien_noa;

import java.text.DecimalFormat;

public class Administrator1 extends Employee1 {
	private String theDepartment;

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		if (!theDepartment.trim().isEmpty())
			this.theDepartment = theDepartment;
		else
			this.theDepartment = "chưa biết";
	}

	public Administrator1(int thePayrollNumber, String theName, double theBassicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBassicMonthlySalary);
		this.theDepartment = theDepartment;
	}

	public Administrator1() {
		super();
		theDepartment = "chưa biết";
	}

	
	public double getMonthlySalary() {
		return super.getMonthlySalary() + super.getMonthlySalary() * 0.4;
	}

	public static String getTieuDe() {
		return String.format("%-15s%-16s%-18s%-15s%-17s", "Mã số", "Tên nhân viên ", " Lương cơ bản", "Tên phòng",
				"Tiền lương hằng tháng");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###$");
		return String.format("%-15s%-15s%-15s", super.toString(), theDepartment, df.format(getMonthlySalary()));
	}

}
