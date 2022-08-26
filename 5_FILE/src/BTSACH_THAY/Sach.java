package BTSACH_THAY;

import java.util.Scanner;

public class Sach {
	protected String maSach, nhaXB;
	protected double donGia,soLuong;
	protected Ngaynhap ngayNhap;
	protected int loaiSach;
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	public Ngaynhap getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Ngaynhap ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getLoaiSach() {
		return loaiSach;
	}
	public void setLoaiSach(int loaiSach) {
		this.loaiSach = loaiSach;
	}
	
	public Sach() {
		super();
		this.maSach = "";
		this.nhaXB = "";
		this.donGia = 0;
		this.soLuong = 0;
		this.ngayNhap = new Ngaynhap();
		this.loaiSach = 0;
	}
	
	
	public Sach(String maSach, String nhaXB, double donGia, double soLuong, Ngaynhap ngayNhap, int loaiSach) {
		super();
		this.maSach = maSach;
		this.nhaXB = nhaXB;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.ngayNhap = ngayNhap;
		this.loaiSach = loaiSach;
	}
	
	
	public void nhap(Scanner sc) {
		System.out.println("Nhap ma sach");
		maSach =  sc.next();
		System.out.println("Nhap nha xuat ban");
		nhaXB =  sc.next();
		sc.nextLine();
		System.out.println("Nhap don gia");
		donGia =  sc.nextDouble();
		System.out.println("Nhap so luong");
		soLuong =  sc.nextDouble();
		System.out.println("Nhap thong tin ngay nhap : ");
		ngayNhap.Nhap(sc);
	}
	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", nhaXB=" + nhaXB + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", ngayNhap=" + ngayNhap.getNgaynhap() + ", loaiSach=" + loaiSach + "]";
	}
	
	public double thanhTien() {
		return donGia * soLuong;
	}
	
	
}
