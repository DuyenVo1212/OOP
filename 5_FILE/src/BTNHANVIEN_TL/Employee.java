package BTNHANVIEN_TL;

import java.util.Scanner;

public abstract class Employee {
	protected int maso;
	protected String tennv;
	protected double luongcb;
	
	public Employee(int maso, String tennv, double luongcb) {
		super();
		this.maso = maso;
		this.tennv = tennv;
		this.luongcb = luongcb;
	}
	public Employee() {
		super();
		maso=0;
		tennv="";
		luongcb=0;
		// TODO Auto-generated constructor stub
	}
	public int getMaso() {
		return maso;
	}
	public void setMaso(int maso) {
		this.maso = maso;
	}
	public String getTennv() {
		return tennv;
	}
	public void setTennv(String tennv) {
		this.tennv = tennv;
	}
	public double getLuongcb() {
		return luongcb;
	}
	public void setLuongcb(double luongcb) {
		this.luongcb = luongcb;
	}
	
	public abstract double luongthang() ;
	

	public void nhap(Scanner scanner) {
		System.out.println("Nhap ma: ");
		maso = scanner.nextInt();
		//thoiGian.nhap(scanner);
		scanner.nextLine();
			System.out.println("Nhap ten: ");
			tennv = scanner.nextLine();
			System.out.println("Nhap luong co ban: ");
			luongcb = scanner.nextDouble();	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ma giao dich: " + maso + "\t"  + "Ten: " + tennv + "\t" + "Luong cb: " + luongcb + "\t";
	}

}
