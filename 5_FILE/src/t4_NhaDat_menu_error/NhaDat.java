package t4_NhaDat_menu_error;

import java.time.LocalDate;

import t1_Xe_menu_full.ChuyenXe;

public class NhaDat implements Comparable<NhaDat> {
	protected String maGD;
	protected LocalDate ngayGD;
	protected double donGia;
	protected double dienTich;
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
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public NhaDat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaDat(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public String toString() {
		return String.format("%10s %10s %10s %10s", maGD, ngayGD, donGia, dienTich);
	}
	@Override
	public int compareTo(NhaDat o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
