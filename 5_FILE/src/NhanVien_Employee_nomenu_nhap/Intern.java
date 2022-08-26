package NhanVien_Employee_nomenu_nhap;

import java.time.LocalDate;

public class Intern extends Employee{
	private String chuyenNganhDangHoc;
	private int hocKiDangHoc;
	
	public Intern() {
		super();
	}
	
	public Intern(String ma, String fullName, LocalDate ngaySinh, String soDienThoai, String chuyenNganhDangHoc,
			int hocKiDangHoc) {
		super(ma, fullName, ngaySinh, soDienThoai);
		this.chuyenNganhDangHoc = chuyenNganhDangHoc;
		this.hocKiDangHoc = hocKiDangHoc;
	}
	
	public String getChuyenNganhDangHoc() {
		return chuyenNganhDangHoc;
	}
	
	public void setChuyenNganhDangHoc(String chuyenNganhDangHoc) {
		if(!chuyenNganhDangHoc.equals("")) {
			this.chuyenNganhDangHoc = chuyenNganhDangHoc;
		}
		else
		this.chuyenNganhDangHoc = "chưa biết";
	}
	
	public int getHocKiDangHoc() {
		return hocKiDangHoc;
	}
	
	public void setHocKiDangHoc(int hocKiDangHoc) {
		if(hocKiDangHoc>=6 && hocKiDangHoc<= 10) {
			this.hocKiDangHoc = hocKiDangHoc;
		}
		else
		this.hocKiDangHoc = 0;
	}
	
	@Override
	public String toString() {
		return String.format("%s %-20s %-15d", super.toString(), this.chuyenNganhDangHoc, this.hocKiDangHoc);
	}
	
	
	
}
