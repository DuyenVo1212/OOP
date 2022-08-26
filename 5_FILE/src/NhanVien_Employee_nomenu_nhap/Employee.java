package NhanVien_Employee_nomenu_nhap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employee {
	private String ma;
	private String fullName;
	private LocalDate ngaySinh;
	private String soDienThoai;
	
	public Employee() {
		super();
	}
	
	public Employee(String ma, String fullName, LocalDate ngaySinh, String soDienThoai) {
		super();
		this.ma = ma;
		this.fullName = fullName;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
	}
	
	public String getMa() {
		return ma;
	}
	
	public void setMa(String ma) {
		if(!ma.equals("")) {
			this.ma = ma;
		}
		else
		this.ma = "chưa biết";
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
	
			this.fullName = fullName;
		
		
	}
	
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public String getSoDienThoai() {
		return soDienThoai;
	}
	
	public void setSoDienThoai(String soDienThoai) {
		if(!soDienThoai.equals("")) {
			this.soDienThoai = soDienThoai;
		}
		else
		this.soDienThoai = "chưa biết";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ma);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ma, other.ma);
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-20s %-30s %-20s %-20s", this.ma, this.fullName, dtf.format(ngaySinh), this.soDienThoai);
	}
	
	
	
	
}
