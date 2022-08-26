package t2_Sach;

import java.time.LocalDate;

public abstract class Sach {
	protected String maS;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nxb;
	protected boolean loaisach;
	public boolean isLoaisach() {
		return loaisach;
	}
	public void setLoaisach(boolean loaisach) {
		this.loaisach = loaisach;
	}
	public String getMaS() {
		return maS;
	}
	public void setMaS(String maS) {
		this.maS = maS;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
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
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	
	
	public Sach(String maS, LocalDate ngayNhap, double donGia, int soLuong, String nxb) {
		super();
		this.maS = maS;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nxb = nxb;
		this.loaisach=loaisach;
	}
	public Sach() {
		
		super();
	}
	public String toString() {
		return String.format("%10s %10s %10s %10s %10s %10s",
				maS, ngayNhap, donGia, soLuong, nxb, loaisach);
	}
}
