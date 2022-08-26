package Sach;

import java.time.LocalDate;

public class SachTK extends Sach{
	
	private double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	public SachTK(String maS, LocalDate ngayNhap, double donGia, int soLuong, String nxb, double thue) {
		super(maS, ngayNhap, donGia, soLuong, nxb);
		this.thue = thue;
	}
	public double ThanhTien() {
		return soLuong*donGia*thue;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s", thue, ThanhTien());
	}
}
