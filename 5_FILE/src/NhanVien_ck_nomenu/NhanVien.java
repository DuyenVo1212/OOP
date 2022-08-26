package NhanVien_ck_nomenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  abstract class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected LocalDate ngayVaoLam;
	public NhanVien(String maNV, String hoTen, LocalDate ngayVaoLam) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngayVaoLam = ngayVaoLam;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(LocalDate ngayVaoLam) {
		LocalDate now = LocalDate.now();
		if(ngayVaoLam.isBefore(now)) {
			this.ngayVaoLam = ngayVaoLam;
		}
		else {
			this.ngayVaoLam = now;
		}
	}
	
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String toString() {
		return String.format("%-10s %-10s  %-10s", maNV, hoTen, dtf.format(ngayVaoLam));
	}
	public abstract double thanhTien();
}
