package BTNHANVIEN_TL;

import java.util.Scanner;

public class Programmer extends Employee{
	private  String ngonngu;
	
	public Programmer(int maso, String tennv, double luongcb,String ngonngu) {
		super(maso, tennv, luongcb);
		this.ngonngu = ngonngu;
	}
	
	public String getNgonngu() {
		return ngonngu;
	}

	public void setNgonngu(String ngonngu) {
		this.ngonngu = ngonngu;
	}

	public Programmer() {
		super();
		ngonngu="";
		// TODO Auto-generated constructor stub
	}
	
	
	public double PhuCap() {
		if(ngonngu.equalsIgnoreCase("java")) {
			return 20/100*this.luongcb;
		}
		return 80/100*this.luongcb;
	}
	@Override
	public double luongthang() {
		// TODO Auto-generated method stub
		return this.luongcb+PhuCap();
	}
	public void nhap(Scanner scanner) {
		// TODO Auto-generated method stub
		super.nhap(scanner);
			System.out.println("Nhap ngon ngu : ");
			ngonngu = scanner.nextLine();
				
	}
				
	
	@Override
	public String toString() {
		return super.toString()+"Ngonngu=" + ngonngu + "\t" + ", PhuCap=" + PhuCap()
				+ ", luongthang=" + luongthang();
	}
	
}
