package QuanLyNhanVien;

import java.util.Scanner;

public class Date {
	private int ngay;
	private int thang;
	private int nam;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNgay() {
		return ngay;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	public void nhap() {
		Scanner xx = new Scanner(System.in);
		System.out.print("nhap ngay: ");
		this.ngay = xx.nextInt();
		xx.nextLine();
		System.out.print("nhap thang: ");
		this.thang = xx.nextInt();
		xx.nextLine();
		System.out.print("nhap nam: ");
		this.nam = xx.nextInt();
		xx.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNgay() + "/" + this.getThang() + "/" + this.getNam();
	}
}
