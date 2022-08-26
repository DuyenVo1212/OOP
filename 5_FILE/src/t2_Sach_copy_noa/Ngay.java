package t2_Sach_copy_noa;

import java.util.Scanner;

public class Ngay {
	private int ngay;
	private int thang;
	private int nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) throws Exception {
		if (ngay > 0)
			this.ngay = ngay;
		else throw new Exception("Ngay ko dc am!");
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) throws Exception {
		if (thang > 0 && thang < 13)
			this.thang = thang;
		else throw new Exception("Thang ko dc am va nho hon 13!");

	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) throws Exception {
		if (nam > 0)
			this.nam = nam;
		
			else throw new Exception("Nam ko dc am!");

	}

	public void hienthi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public boolean hople() {
		int[] ngayMax = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (nam % 4 == 0) {
			ngayMax[2] = 29;
		}
		if(ngay<=0)
			return false;
//		if (thang > 0 && thang < 13)
//			return false;
		
		if (ngay > ngayMax[thang]) {
			return false;
		}
		return true;
		
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay");
			ngay = sc.nextInt();
			System.out.println("Nhap thang");
			thang = sc.nextInt();
			System.out.println("Nhap nam");
			nam = sc.nextInt();
			if(!hople())
			System.out.println("Nhap lai!!!");
		} while (!hople());
		
	}

	public static void main(String[] args) {
		Ngay ngay = new Ngay();
		ngay.nhap();
		ngay.hienthi();
	}
}
