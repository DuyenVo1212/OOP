package t3_GD_menu;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich {
	protected String maGD;
	protected LocalDate ngayGD;
	protected double donGia;
	protected int soLuong;

	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	
	}
//	protected GiaoDich() {
//		this.maGD = "";
//		this.ngayGD =null;
//		this.donGia = 0;
//		this.soLuong = 0;
//		//this.ThanhTien=0;
//	
//	}
	
	
	public String toString() {
		return String.format("%10s %10s %10s %10s ", 
				maGD, ngayGD, donGia, soLuong);
	}
}
