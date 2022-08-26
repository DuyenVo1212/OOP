package t2_Sach_copy_noa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Sach {
	protected String maS;
	protected LocalDate ngayNhap;
	protected double donGia,ThanhTien;
	protected int soLuong;
	protected String nxb;
	
	
//	protected boolean loaisach;
//	
//	public boolean isLoaisach() {
//		return loaisach;
//	}
//	public void setLoaisach(boolean loaisach) {
//		this.loaisach = loaisach;
//	}
	
	public String getMaS() {
		return maS;
	}
	public void setMaS(String maS) throws Exception{
		this.maS = maS;
		if(!maS.isEmpty())this.maS = maS;
		else throw new Exception("Ten hang ko dc trong!");
	}
	public double getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(double thanhTien) {
		ThanhTien = thanhTien;
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
	public void setDonGia(float donGia) throws Exception {
		if(donGia>=0) this.donGia = donGia;
		else throw new Exception("Don gia ko dc am!");
	}
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) throws Exception {
		if(donGia>0) this.soLuong = soLuong;
		else throw new Exception("Don gia phai lon hon 0!");
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	
	// abstract double ThanhTien();
	public Sach(String maS, LocalDate ngayNhap, double donGia, int soLuong, String nxb) {
		//super();
		this.maS = maS;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nxb = nxb;
		//this.ThanhTien=tt;
		//this.loaisach=loaisach;
	}
	public Sach() {
	//	super();
		this.maS="";
		this.ngayNhap=null;
		this.donGia=0;
		this.soLuong=0;
		this.nxb="";
	}
	
	
	public String toString() {
		return String.format("%10s %10s %15f %10d %10s ",
				maS, ngayNhap, donGia, soLuong, nxb);
	}
}

//public Hang(String maHang, String tenHang, float donGia, Date ngaySX, Date ngayHH) throws Exception {
//	super();
//	if(!nxb.isEmpty()) 
//		this.nxb=nxb;
//		else throw new Exception("Ma hang ko dc trong!");
//	setTenHang(tenHang);
//	setDonGia(donGia);
//	setNgaySX(ngaySX);
//	setNgayHH(ngayHH);
//}
