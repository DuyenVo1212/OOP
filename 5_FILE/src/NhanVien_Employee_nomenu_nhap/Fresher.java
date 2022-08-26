package NhanVien_Employee_nomenu_nhap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fresher extends Employee{
	private LocalDate namTotNghiep;
	private String xepLoaiTotNghiep;
	
	public Fresher() {
		super();
	}
	
	public Fresher(String ma, String fullName, LocalDate ngaySinh, String soDienThoai, LocalDate namTotNghiep,
			String xepLoaiTotNghiep) {
		super(ma, fullName, ngaySinh, soDienThoai);
		this.namTotNghiep = namTotNghiep;
		this.xepLoaiTotNghiep = xepLoaiTotNghiep;
	}
	
	public LocalDate getNamTotNghiep() {
		return namTotNghiep;
	}
	
	public void setNamTotNghiep(LocalDate namTotNghiep) {
		if(namTotNghiep.isBefore(LocalDate.now())) {
			this.namTotNghiep = namTotNghiep;
		}
		else
		this.namTotNghiep = LocalDate.now();
	}
	
	public String getXepLoaiTotNghiep() {
		return xepLoaiTotNghiep;
	}
	
	public void setXepLoaiTotNghiep(String xepLoaiTotNghiep) {
		if(!xepLoaiTotNghiep.equals("")) {
			this.xepLoaiTotNghiep = xepLoaiTotNghiep;
		}
		else
		this.xepLoaiTotNghiep = "chưa biết";
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s %-20s %-20s", super.toString(), dtf.format(namTotNghiep), this.xepLoaiTotNghiep);
	}
	
	
}
