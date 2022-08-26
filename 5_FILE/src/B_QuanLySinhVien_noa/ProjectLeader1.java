package B_QuanLySinhVien_noa;

public class ProjectLeader1 extends Programmer1 {
	public ProjectLeader1(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguege) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguege);
	}

	public ProjectLeader1() {
		super();
	}

	@Override
	public double getMonthlySalary() {
		return super.getMonthlySalary() + super.getMonthlySalary() * 0.2;
	}
	
	public static String getTieuDe() {
		return String.format("%-15s%-16s%-18s%-15s%-17s", "Mã số", "Tên nhân viên ", " Lương cơ bản", "Ngôn ngữ",
				"Tiền lương hằng tháng");
	}

	@Override
	public String toString() {
		return String.format("%s", super.toString());
	}

}