package BTSACH_THAY_ARR;

import java.util.Scanner;

public class SachThamKhao extends Sach {
	private double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public SachThamKhao() {
		super();
		this.thue = 0;
	}
	
	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
		System.out.println("Nhap thue :");
		thue =  sc.nextDouble();
		
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "thue = "+ thue;
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return super.thanhTien()+thue;
	}
	
	
}
