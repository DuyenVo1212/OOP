package B_QuanLySinhVien_noa;

import java.text.DecimalFormat;
import java.util.Objects;

public  class Employee1 {
	protected int thePayrollNumber;
	protected String theName;
	protected double theBassicMonthlySalary;

	public Employee1() {
		this(0, "chưa biết", 0);
	}

	public Employee1(int thePayrollNumber, String theName, double theBassicMonthlySalary) {
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBassicMonthlySalary = theBassicMonthlySalary;
	}

	public int getThePayrollNumber() {
		return thePayrollNumber;
	}

	private void setThePayrollNumber(int thePayrollNumber) {
		if (thePayrollNumber >= 0)
			this.thePayrollNumber = thePayrollNumber;
		else
			this.thePayrollNumber = 0;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		if (!theName.trim().isEmpty())
			this.theName = theName;
		else
			this.theName = "chưa biết";
	}

	public double getTheBassicMonthlySalary() {
		return theBassicMonthlySalary;
	}

	public void setTheBassicMonthlySalary(double theBassicMonthlySalary) {
		if (theBassicMonthlySalary >= 0)
			this.theBassicMonthlySalary = theBassicMonthlySalary;
		else
			this.theBassicMonthlySalary = 0;
	}
	public  double getMonthlySalary() {
		return theBassicMonthlySalary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(thePayrollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return thePayrollNumber == other.thePayrollNumber;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###$");
		return String.format("%-15d%-17s%-17s", thePayrollNumber, theName, df.format(theBassicMonthlySalary));
	}
}
