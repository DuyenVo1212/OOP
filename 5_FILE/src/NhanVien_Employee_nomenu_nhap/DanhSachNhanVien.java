package NhanVien_Employee_nomenu_nhap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachNhanVien {
	private List<Employee> dsNhanVien;
	/**
	 * khởi tạo danh sách
	 */
	public DanhSachNhanVien() {
		dsNhanVien = new ArrayList<Employee>();
	}
	/**
	 * thêm một nhân viên vào danh sách, không được thêm trùng mã
	 * @param e
	 * @return
	 */
	public boolean themNhanVien(Employee e) {
		if(dsNhanVien.contains(e)) 
			return false;
		else
			dsNhanVien.add(e);
			return true;
	}
	
	public String toString() {
		String s = "";
		for (Employee employee : dsNhanVien) {
			s += employee+ "\n";
		}
		return s;
	}
	
	public boolean suaNgaySinhNhanVien(String ma,LocalDate ngaySinhMoi) {
		for (Employee employee : dsNhanVien) {
			if(employee.getMa().equalsIgnoreCase(ma))
			employee.setNgaySinh(ngaySinhMoi);
			return true;
		}
		return false;
	}
	
	public ArrayList<Employee> getNhanVienKinhnghiem(){
		ArrayList<Employee> e = new ArrayList<Employee>();
		for (Employee employee : dsNhanVien) {
			if(employee instanceof Experience) {
				if(((Experience) employee).getSoNamKinhNghiem()>5) {
					e.add(employee);
				}
			}
		}
		return e;
	}
	
	public void sapXepTenNhanVienTangDan() {
		Collections.sort(dsNhanVien, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return ((String)o1.getFullName()).compareTo((String)o2.getFullName());
			}
		});
	}
}
