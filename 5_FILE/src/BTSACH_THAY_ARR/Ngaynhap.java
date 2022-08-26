package BTSACH_THAY_ARR;

import java.util.Scanner;

public class Ngaynhap {
	private int ngay,thang,nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public Ngaynhap() {
		super();
		this.ngay = 0;
		this.thang = 0;
		this.nam = 0;
	}

	public Ngaynhap(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public void Nhap(Scanner sc) {
		System.out.println("Nhap ngay");
		ngay =  sc.nextInt();
		System.out.println("Nhap thang");
		thang =  sc.nextInt();
		System.out.println("Nhap nam");
		nam =  sc.nextInt();
	}
	
	
	public String getNgaynhap() {
		return ngay+"/"+thang+"/"+nam;
	}
}
