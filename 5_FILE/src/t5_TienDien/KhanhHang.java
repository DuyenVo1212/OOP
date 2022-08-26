package t5_TienDien;

import java.time.LocalDate;

public class KhanhHang {
	protected String maKH;
	protected String hoTen;
	protected LocalDate ngayLap;
	protected double soKW;
	protected double donGia;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public KhanhHang(String maKH, String hoTen, LocalDate ngayLap, double soKW, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLap = ngayLap;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public KhanhHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s %-10s", maKH, hoTen, ngayLap, soKW, donGia);
	}
}
