package B_QuanLySinhVien_noa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import nguyenTruongTuanKiet.bai06set.PhongHoc1;

public class SoftwareHouse1 {
	private String theName;
	private Set<Employee1> aName;

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		if (!theName.trim().isEmpty())
			this.theName = theName;
		else
			this.theName = "chưa biết";
	}

	public SoftwareHouse1(String theName) {
		setTheName(theName);
		aName = new HashSet<Employee1>();
	}

	public boolean addEmployee(Employee1 emp) {
		return aName.add(emp);
	}

	public String displayAllStaff() {
		String s = "";
		s += "Lập trình viên :\n" + Programmer1.getTieuDe() + "\n";
		for (Employee1 employee : aName) {
			if (employee instanceof Programmer1 && !(employee instanceof ProjectLeader1))
				s += employee + "\n";
		}
		s += "Người quản lý:\n" + Administrator1.getTieuDe() + "\n";
		for (Employee1 employee : aName) {
			if (employee instanceof Administrator1)
				s += employee + "\n";
		}
		s += "Người trưởng dự án:\n" + ProjectLeader1.getTieuDe() + "\n";
		for (Employee1 employee : aName) {
			if (employee instanceof ProjectLeader1)
				s += employee + "\n";
		}

		return s;
	}

	public String xuatDS(Employee1 h) {
		String s = "";
		if (h instanceof Programmer1 && !(h instanceof ProjectLeader1)) {
			s += "Lập trình viên :\n" + Programmer1.getTieuDe() + "\n";
			s += h + "\n";
		}

		if (h instanceof Administrator1) {
			s += "Người quản lý:\n" + Administrator1.getTieuDe() + "\n";
			s += h + "\n";
		}
		if (h instanceof ProjectLeader1) {
			s += "Người trưởng dự án:\n" + ProjectLeader1.getTieuDe() + "\n";
			s += h + "\n";
		}

		return s;
	}

	public double getMonthlySalaryBill() {
		double sum = 0;
		for (Employee1 employee : aName) {
			sum += employee.getMonthlySalary();
		}
		return sum;
	}

	public List<Employee1> sortAllStaffByName() {
		List<Employee1> temp = new ArrayList<Employee1>(aName);
		Collections.sort(temp, new Comparator<Employee1>() {
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				return (o1.getTheName()).compareTo(o2.getTheName());
			}
		});
		return temp;
	}

	public String displayListProgrammers() {
		String s = "";
		s += "Lập trình viên :\n" + Programmer1.getTieuDe() + "\n";
		for (Employee1 employee : aName) {
			if (employee instanceof Programmer1 && !(employee instanceof ProjectLeader1))
				s += employee + "\n";
		}
		return s;
	}

	public boolean updateDepartmentForAdmin(String deptNew, int aPayrollNo) {
		for (Employee1 employee : aName) {
			if (employee instanceof Administrator1)
				if (employee.getThePayrollNumber() == aPayrollNo) {
					((Administrator1) employee).setTheDepartment(deptNew);
					;
					return true;
				}
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		for (Employee1 employee : aName) {
			if (employee.getThePayrollNumber() == id)
				if (employee != null)
					aName.remove(employee);
			return true;
		}
		return false;
	}
}
