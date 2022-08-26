package BTSACH_HIEU;

import java.util.Scanner;

public class ThoiGian {
	private int ngay, thang, nam;

	public ThoiGian() {
		ngay = 1;
		thang = 1;
		nam = 1;
	}

	public ThoiGian(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

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
	
	public boolean laNamNhuan()
	{
		if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0)
		{
			return true;
		}
		return false;

		// <=> return ((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0);
	}
	private boolean checkNgay()
	{
		switch (thang)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			if (ngay > 0 && ngay <= 31) {
				return true;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11: 
			if (ngay > 0 && ngay <= 30) {
				return true;
			}
			break;
		case 2:
			if (laNamNhuan())
			{
				if (ngay > 0 && ngay <= 29) {
					return true;
				}
			}
			else
			{
				if (ngay > 0 && ngay <= 28) {
					return true;
				}
			}
			break;
		}

		return false;
	}
	
	public boolean laNgayHopLe()
	{
		// Kiểm tra năm
		if (nam < 0)
		{
			return false; // Ngày không còn hợp lệ nữa!
		}

		// Kiểm tra tháng	
		if (thang < 1 || thang > 12)
		{
			return false; // Ngày không còn hợp lệ nữa!
		}

		// Kiểm tra ngày
		if (ngay < 1 || checkNgay() == false)
		{
			return false; // Ngày không còn hợp lệ nữa!
		}

		return true; // Trả về trạng thái cuối cùng...
	}
	
	public void nhap(Scanner scanner) {
		do {
			System.out.println("Nhap ngay: ");
			ngay = scanner.nextInt();
			System.out.println("Nhap thang: ");
			thang = scanner.nextInt();
			System.out.println("Nhap nam: ");
			nam = scanner.nextInt();
		} while (!laNgayHopLe());
	}
	
	
}