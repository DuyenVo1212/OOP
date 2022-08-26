package t6_KhachSan_nomenu;

import java.time.LocalDate;

public class HoaDon {
	protected String maHD;
	protected LocalDate ngayHD;
	protected String tenKH;
	protected String maPhong;
	protected double donGia;
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public LocalDate getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(LocalDate ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public HoaDon(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia) {
		super();
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.tenKH = tenKH;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s %-10.2f", maHD, ngayHD, tenKH, maPhong, donGia);
	}
}
