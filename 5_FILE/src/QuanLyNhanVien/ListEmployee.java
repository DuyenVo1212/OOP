package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEmployee {
	private ArrayList<Employee> listE = new ArrayList<Employee>();

	public ListEmployee() {
		listE = new ArrayList<Employee>();
	}

	public boolean searchID(String id, ArrayList<Employee> l) {
		for (Employee i : listE) {
			if (i.getID().equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;
	}

	public void updateEmployee(String id, Scanner sc) {
		for (int j = 0; j < listE.size(); j++) {
			if (listE.get(j).getID().equalsIgnoreCase(id)) {
					int loai;
					System.out.println("chon loai muon nhap : \n\t0.Experience \n\t1.Fresher \n\t2.Intern");
					loai = sc.nextInt();
					sc.nextLine();
					if (loai == 0) {
						Experience employee = new Experience();
						employee.nhap(sc);
						listE.set(j, employee);
					} else if (loai == 1) {
						Fresher employee = new Fresher();
						employee.nhap(sc);
						listE.set(j, employee);
					} else {
						Intern employee = new Intern();
						employee.nhap(sc);
						listE.set(j, employee);
					}
				
			}
		}
	}
	public boolean addEmployee(Scanner sc, int loai) {
		Employee employee;
		if (loai == 0) {
			employee = new Experience();
			employee.nhap(sc);
		} else if (loai == 1) {
			employee = new Fresher();
			employee.nhap(sc);
		} else {
			employee = new Intern();
			employee.nhap(sc);
		}

		if (searchID(employee.getID(), listE)) {
			System.out.println("Khong them duoc do trung ma!");
			return false;
		} else {
			listE.add(employee);
			System.out.println("them thanh cong");
			return true;
		}
	}

	public void PrintList() {
		for (Employee i : listE) {
			System.out.println(i.toString());
		}
	}

	public boolean Remove(String id) {
		for (int i = 0; i < listE.size(); i++) {
			if (listE.get(i).getID().equalsIgnoreCase(id)) {
				listE.remove(i);
				System.out.println("xoa thanh cong!");
				return true;
			}
		}
		System.out.println("xoa that bai!");
		return false;
	}

	public void getIntern() {
		for (int i = 0; i < listE.size(); i++) {
			if (listE.get(i) instanceof Intern || listE.get(i).getEmployee_type() == 2) {
				System.out.println(listE.get(i).toString());
			}
		}
	}

	public void getExperience() {
		for (int i = 0; i < listE.size(); i++) {
			if (listE.get(i) instanceof Experience || listE.get(i).getEmployee_type() == 0) {
				System.out.println(listE.get(i).toString());
			}
		}
	}

	public void getFresher() {
		for (int i = 0; i < listE.size(); i++) {
			if (listE.get(i) instanceof Fresher || listE.get(i).getEmployee_type() == 1) {
				System.out.println(listE.get(i).toString());
			}
		}
	}

}
