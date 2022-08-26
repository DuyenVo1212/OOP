package EndLearn;

import java.time.LocalDate;

public abstract class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected LocalDate ngayLam;
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		if(maNV != "") {
			this.maNV = maNV;
		}
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(hoTen != "") {
			this.hoTen = hoTen;
		}
	}
	public LocalDate getNgayLam() {
		return ngayLam;
	}
	public void setNgayLam(LocalDate ngayLam) {
		LocalDate ld = LocalDate.now();
		if(ld.getDayOfMonth() >= ngayLam.getDayOfMonth()) {
			this.ngayLam = ngayLam;
		}
	}
	public NhanVien(String maNV, String hoTen, LocalDate ngayLam) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngayLam = ngayLam;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("%-10s %-10s %-15s", maNV, hoTen, ngayLam);
	}
}
