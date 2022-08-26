package B_QuanLySinhVien_noa;

import java.text.DecimalFormat;

public class Programmer1 extends Employee1 {
	protected String theLanguage;

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		if (!theLanguage.trim().isEmpty())
			this.theLanguage = theLanguage;
		else
			this.theLanguage = "chưa biết";
	}

	public Programmer1() {
		super();
		theLanguage = "chưa biết";
	}

	public Programmer1(int thePayrollNumber, String theName, double theBassicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBassicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	@Override
	public double getMonthlySalary() {
		if (theLanguage.equalsIgnoreCase("Java"))
			return super.getMonthlySalary() + getTheBassicMonthlySalary() * 0.2;
		return super.getMonthlySalary();
	}

	public static String getTieuDe() {
		return String.format("%-15s%-16s%-18s%-15s%-17s", "Mã số", "Tên nhân viên ", " Lương cơ bản", "Ngôn ngữ",
				"Tiền lương hằng tháng");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###$");
		return String.format("%-15s%-15s%-15s", super.toString(), theLanguage, df.format(getMonthlySalary()));
	}

}
