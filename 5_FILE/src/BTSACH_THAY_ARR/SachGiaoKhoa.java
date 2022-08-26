package BTSACH_THAY_ARR;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
	private boolean tinhtrang;

	public boolean isTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public SachGiaoKhoa() {
		super();
		this.tinhtrang = true;
	}
	
	

	@Override
	public void nhap(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhap(sc);
		System.out.println("Nhap tinh trang sach (1|0) :");
		int tt =  sc.nextInt();
		this.tinhtrang = tt == 1?true:false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +tinhtrang;
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		if(tinhtrang)
			return super.thanhTien();
		else
			return super.thanhTien()*0.5; 
	}
	
	
	
}
